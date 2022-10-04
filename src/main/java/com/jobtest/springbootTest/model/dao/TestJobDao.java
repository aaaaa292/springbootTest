package com.jobtest.springbootTest.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobtest.springbootTest.model.bean.table1;

@Repository
public interface TestJobDao extends JpaRepository<table1,Integer>{
	@Query("from table1 where idx = :idx and c_aes256 = :c_aes256 and c_base64 = :c_base64" )
	public Optional<table1> findById(@Param("idx") Integer idx, 
								 @Param("c_aes256") String c_aes256,
								@Param("c_base64") String c_base64);

}
