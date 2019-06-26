
/**  
* @Title: TestJDBCTemplate.java  
* @Package com.demo.template  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
* @version V1.0  
*/
package com.demo.design.template;

import java.util.List;

import com.demo.design.template.jdbc.MemberDao;

public class TestJDBCTemplate {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao(null);
		String sql = "select * from member";
		List<?> result = memberDao.selectMemberInfo(sql, null);
		System.out.println(result);
	}
}
