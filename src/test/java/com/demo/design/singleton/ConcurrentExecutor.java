
/**  
* @Title: ConcurrentExecutor.java  
* @Package com.demo.singleton  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.design.singleton;

import java.util.concurrent.*;

/**
 * Created by Tom.
 */
public class ConcurrentExecutor {
    /**
     * @param runHandler
     * @param executeCount ������������
     * @param concurrentCount ͬʱ����ִ�е��߳���
     * @throws Exception
     */
    public static void execute(final RunHandler runHandler,int executeCount,int concurrentCount) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //�����ź������˴����ڿ��Ʋ������߳���
        final Semaphore semaphore = new Semaphore(concurrentCount);
        //��������ʵ�ּ������ݼ�
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i ++){
            executorService.execute(new Runnable() {
                public void run() {
                    try{
                        //ִ�д˷������ڻ�ȡִ����ɣ����ܼ�δ�ͷŵ������������executeCountʱ,
                        //������ͬ�ԣ������߳������ȴ���֪����ȡ�����
                        semaphore.acquire();
                        runHandler.handler();
                        //�ͷ����
                        semaphore.release();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();//�߳�������֪������ֵΪ0ʱ���������ͷţ���������ִ��
        executorService.shutdown();
    }
    public interface RunHandler{
        void handler();
    }
}
