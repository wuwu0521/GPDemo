
/**  
* @Title: JdbcTemplate.java  
* @Package com.demo.template.jdbc  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
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
			//定义
			List<Object> result = new ArrayList<Object>();
			int rowNum = 1;
			
			//1、获取数据库连接
			Connection conn = dataSource.getConnection();
			
			//2、创建语句集
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			//3、执行语句集
			for(int i=0;i<values.length;i++){
				pstm.setObject(i, values[i]);
			}
			ResultSet res = pstm.executeQuery();
			
			//4、处理结果集
			while(res.next()){
				result.add(rowMapper.mapRow(res, rowNum++));
			}
			//5、关闭连接
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
