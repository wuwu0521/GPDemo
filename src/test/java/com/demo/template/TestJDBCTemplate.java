
/**  
* @Title: TestJDBCTemplate.java  
* @Package com.demo.template  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��28��  
* @version V1.0  
*/
package com.demo.template;

import java.util.List;

import com.demo.template.jdbc.MemberDao;

public class TestJDBCTemplate {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao(null);
		String sql = "select * from member";
		List<?> result = memberDao.selectMemberInfo(sql, null);
		System.out.println(result);
	}
}
