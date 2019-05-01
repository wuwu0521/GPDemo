
/**  
* @Title: JdbcTemplate.java  
* @Package com.demo.template.jdbc  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��28��  
* @version V1.0  
*/
package com.demo.template.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public abstract class JdbcTemplate {

	private DataSource dataSource;

	public JdbcTemplate(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values){
		try{
			//����
			List<Object> result = new ArrayList<Object>();
			int rowNum = 1;
			
			//1����ȡ���ݿ�����
			Connection conn = dataSource.getConnection();
			
			//2��������伯
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			//3��ִ����伯
			for(int i=0;i<values.length;i++){
				pstm.setObject(i, values[i]);
			}
			ResultSet res = pstm.executeQuery();
			
			//4����������
			while(res.next()){
				result.add(rowMapper.mapRow(res, rowNum++));
			}
			//5���ر�����
			res.close();
			pstm.close();
			conn.close();
			return result;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
