package com.jobtest.springbootTest.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobtest.springbootTest.model.bean.Table1;

@Repository
public interface TestJobDao extends JpaRepository<Table1,Integer>{
	@Query("from Table1 where id = :id and name = :name and age = :age" )
	public Optional<Table1> findById(@Param("id") Integer id, 
								 @Param("name") String name,
								@Param("age") String age);

}
