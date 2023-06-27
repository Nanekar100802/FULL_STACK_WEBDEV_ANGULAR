package com.first.sts;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	@Override
	public String getName() {
		String query = " select sname from stud where rollno=2";
		Map<String, Object> params = new HashMap<String, Object>();
		
		return namedParameterJdbcTemplate.queryForObject(query, params, String.class);

		
	}

}
