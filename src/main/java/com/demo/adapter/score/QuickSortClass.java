
/**  
* @Title: QuickSortClass.java  
* @Package com.demo.adapter.score  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
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
		// 1,�ҵ��ݹ��㷨�ĳ���
		if (low > high) {
			return;
		}
		// 2, ��
		int i = low;
		int j = high;
		// 3,key
		int key = a[low];
		// 4�����һ������
		while (i < j) {
			// 4.1 �����������ҵ���һ��С��key����
			while (i < j && a[j] > key) {
				j--;
			}
			// 4.2 ���������ҵ���һ������key����
			while (i < j && a[i] <= key) {
				i++;
			}
			// 4.3 ����
			if (i < j) {
				int p = a[i];
				a[i] = a[j];
				a[j] = p;
			}
		}
		// 4.4������key��λ��
		int p = a[i];
		a[i] = a[low];
		a[low] = p;
		// 5, ��key��ߵ�������
		quickSort(a, low, i - 1);
		// 6, ��key�ұߵ�������
		quickSort(a, i + 1, high);
	}

}
