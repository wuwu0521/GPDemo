
/**  
* @Title: BinarySearchClass.java  
* @Package com.demo.adapter.score  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
* @version V1.0  
*/
package com.demo.adapter.score;

public class BinarySearchClass {

	public int BinarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = array[mid];
			if (midVal < key) {
				low = mid + 1;
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return 1;
			}
		}
		return -1;
	}

}
