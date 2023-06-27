package com.first.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;
	@Override
	public String getName() {
		 
		return studentDao.getName();
	}

}
