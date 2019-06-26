
/**  
* @Title: ScoreAdapter.java  
* @Package com.demo.adapter  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��30��  
* @version V1.0  
*/
package com.demo.design.adapter.score;

public class ScoreAdapter implements ScoreOperation{

	private QuickSortClass objQuick;
	
	private BinarySearchClass objBinary;

	public ScoreAdapter() {
		this.objQuick = new QuickSortClass();
		this.objBinary = new BinarySearchClass();
	}
	public int[] Sort(int[] array){
		return objQuick.quickSort(array);
	}
	
	@Override
	public int Search(int[] array, int key) {
		return objBinary.BinarySearch(array, key);
	}
}