package com.jobtest.springbootTest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobtest.springbootTest.model.bean.Table1;
import com.jobtest.springbootTest.model.dao.TestJobDao;

@Service
@Transactional
public class TestJobService {
	
	@Autowired
	private TestJobDao tDao;
	
	// 用陣列拿到所有資料
		public List<Table1> getAll() {
			return tDao.findAll();
		}
	//新增資料
		public void insertJson(Table1 t1) {
			tDao.save(t1);
		}
		
}
