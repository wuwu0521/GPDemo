
/**  
* @Title: ScoreAdapter.java  
* @Package com.demo.adapter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
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