
/**  
* @Title: TestAdapter.java  
* @Package com.demo.adapter  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月30日  
* @version V1.0  
*/
package com.demo.adapter.score;

import com.alibaba.fastjson.JSONObject;

public class TestAdapter {

	public static void main(String[] args) {
		
		ScoreOperation score = new ScoreAdapter();
		int[] socres = { 84,76, 50, 69, 90, 92, 88, 86 };
		System.out.println("排序前：socres:"+JSONObject.toJSONString(socres));
		score.Sort(socres);
		System.out.println("排序后：socres:"+JSONObject.toJSONString(socres));
	}
}
