
/**  
* @Title: MemberDao.java  
* @Package com.demo.template.jdbc  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
* @version V1.0  
*/
package com.demo.design.template.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

public class MemberDao extends JdbcTemplate{

	public MemberDao(DataSource dataSource) {
		super(dataSource);
	}
	
	public List<?> selectMemberInfo(String sql, Object[] values) {
		RowMapper<Member> rowMapper = new RowMapper<Member>() {
			public Member mapRow(ResultSet set, int rowNum) {
				try {
					Member member = new Member();
					member.setUserName(set.getString("wuwu"));
					member.setPassWord(set.getString("123456"));
					member.setAddress("1111");
					return member;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		List<?> memberList = super.executeQuery(sql, rowMapper, values);
		return memberList;
	}
	
}
