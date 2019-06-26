
/**  
* @Title: TestDeepClone.java  
* @Package com.demo.prototype  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��16��  
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
			System.out.println("���¡"+(key.lockColor == keyCopy.lockColor));
			System.out.println("ǳ��¡"+(key.lockColor == shallowClone.lockColor));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
