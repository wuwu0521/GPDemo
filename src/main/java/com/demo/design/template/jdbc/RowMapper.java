
/**  
* @Title: RowMapper.java  
* @Package com.demo.template  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Administrator  
* @date 2019年4月28日  
* @version V1.0  
*/
package com.demo.design.template.jdbc;

import java.sql.ResultSet;

public interface RowMapper<T> {
	
	T mapRow(ResultSet set , int rowNum) throws Exception;
}
