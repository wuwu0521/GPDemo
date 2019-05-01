
/**  
* @Title: QuickSortClass.java  
* @Package com.demo.adapter.score  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
* @version V1.0  
*/
package com.demo.adapter.score;

public class QuickSortClass{

	public static int[] quickSort(int[] a) {
		if (a.length > 0) {
			quickSort(a, 0, a.length - 1);
		}
		return a;
	}

	private static void quickSort(int[] a, int low, int high) {
		// 1,找到递归算法的出口
		if (low > high) {
			return;
		}
		// 2, 存
		int i = low;
		int j = high;
		// 3,key
		int key = a[low];
		// 4，完成一趟排序
		while (i < j) {
			// 4.1 ，从右往左找到第一个小于key的数
			while (i < j && a[j] > key) {
				j--;
			}
			// 4.2 从左往右找到第一个大于key的数
			while (i < j && a[i] <= key) {
				i++;
			}
			// 4.3 交换
			if (i < j) {
				int p = a[i];
				a[i] = a[j];
				a[j] = p;
			}
		}
		// 4.4，调整key的位置
		int p = a[i];
		a[i] = a[low];
		a[low] = p;
		// 5, 对key左边的数快排
		quickSort(a, low, i - 1);
		// 6, 对key右边的数快排
		quickSort(a, i + 1, high);
	}

}
