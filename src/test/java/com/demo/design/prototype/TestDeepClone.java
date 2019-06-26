
/**  
* @Title: TestDeepClone.java  
* @Package com.demo.prototype  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月16日  
* @version V1.0  
*/
package com.demo.design.prototype;

import com.demo.design.prototype.deep.BronzeKeys;
import com.demo.design.prototype.deep.LockColor;

public class TestDeepClone {

	public static void main(String[] args) {
		
		try {
			BronzeKeys key = new BronzeKeys(new LockColor());
        	BronzeKeys keyCopy = (BronzeKeys) key.clone();
			LockColor color = new LockColor();
			color.setColor("prototype");
			keyCopy.lockColor = color;
			
			BronzeKeys shallowClone = key.shallowClone(key);
			System.out.println(keyCopy.lockColor);
			System.out.println(shallowClone.lockColor);
			System.out.println("深克隆"+(key.lockColor == keyCopy.lockColor));
			System.out.println("浅克隆"+(key.lockColor == shallowClone.lockColor));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
