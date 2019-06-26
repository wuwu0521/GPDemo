
/**  
* @Title: RowMapper.java  
* @Package com.demo.template  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author Administrator  
* @date 2019��4��28��  
* @version V1.0  
*/
package com.demo.design.template.jdbc;

import java.sql.ResultSet;

public interface RowMapper<T> {
	
	T mapRow(ResultSet set , int rowNum) throws Exception;
}
