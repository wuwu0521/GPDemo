
/**  
* @Title: BronzeLock.java  
* @Package com.demo.prototype.deep  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
* @version V1.0  
*/
package com.demo.prototype.deep;

import java.util.Date;

public class BronzeLock {

    public String lock_id = "1000";

    public String lock_shape = "Բ��";

    public Date date;


    public void setLock_shape(String lock_shape) {
        this.lock_shape = lock_shape;
    }

    public String getLock_id() {
        return lock_id;
    }

    public String getLock_shape() {
        return lock_shape;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}