
/**  
* @Title: TestAdapter.java  
* @Package com.demo.adapter  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
* @version V1.0  
*/
package com.demo.adapter.score;

import com.alibaba.fastjson.JSONObject;

public class TestAdapter {

	public static void main(String[] args) {
		
		ScoreOperation score = new ScoreAdapter();
		int[] socres = { 84,76, 50, 69, 90, 92, 88, 86 };
		System.out.println("����ǰ��socres:"+JSONObject.toJSONString(socres));
		score.Sort(socres);
		System.out.println("�����socres:"+JSONObject.toJSONString(socres));
	}
}
