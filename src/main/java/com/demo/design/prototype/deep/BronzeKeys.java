
/**  
* @Title: BronzeKeys.java  
* @Package com.demo.prototype.deep  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.prototype.deep;

import java.io.*;
import java.util.Date;

public class BronzeKeys extends BronzeLock implements Cloneable, Serializable {

    public LockColor lockColor;

    public BronzeKeys(LockColor color){
        this.lockColor = color;
        this.date = new Date();
    }

    @Override
	public Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            BronzeLock copy = (BronzeLock)ois.readObject();
            copy.date = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public BronzeKeys shallowClone(BronzeKeys target){
        BronzeKeys keys = new BronzeKeys(target.lockColor);
        keys.lock_id = target.lock_id;
        keys.lock_shape = target.lock_shape;
        keys.date = new Date();
        keys.lockColor = target.lockColor;
        return  keys;
    }
}