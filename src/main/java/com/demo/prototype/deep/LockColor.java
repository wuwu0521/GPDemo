
/**  
* @Title: LockColor.java  
* @Package com.demo.prototype.deep  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.prototype.deep;

import java.io.Serializable;


public class LockColor implements Serializable {

    public String color = "黄色";

    public void setColor(String color) {
        this.color = color;
    }
}