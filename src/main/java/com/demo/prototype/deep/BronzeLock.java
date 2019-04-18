
/**  
* @Title: BronzeLock.java  
* @Package com.demo.prototype.deep  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.prototype.deep;

import java.util.Date;

public class BronzeLock {

    public String lock_id = "1000";

    public String lock_shape = "圆形";

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