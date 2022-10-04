package com.jobtest.springbootTest.model.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jobtest.springbootTest.model.bean.table1;
import com.jobtest.springbootTest.service.TestJobService;

@Controller
public class TestController {

	@Autowired
	private TestJobService tService;
	
	
	@GetMapping("/pagination/select")
	public String memberManage(Model m) { //
		List<table1> dataList = new ArrayList<table1>();
		List<table1> table1s = tService.getAll();
		if(table1s != null && table1s.size()>0) {
			table1 tls;
			for(table1 data:table1s) {
				tls = new table1();
				tls.setIdx(data.getIdx());
				tls.setC_aes256(transData(transString(data.getC_base64()),"key"));
				tls.setC_base64(transData(transString(data.getC_base64()),"value"));
				dataList.add(tls);
			}
		}
		
		m.addAttribute("table1", dataList);
		System.out.println(dataList);
		return "/result"; // 跳轉到result.jsp頁面
	}
	
	@SuppressWarnings("deprecation")
	private String transString(String base64String) {
		String resultString = "";
		
		if(!StringUtils.isEmpty(base64String)) {
			// Base64解碼
			byte[] decodedBytes = Base64.getDecoder().decode(new String(base64String).getBytes());
			resultString = new String(decodedBytes);
		}
		return resultString;
	}
	
	private String transData(String dataString,String dataValue) {
		String data = "";
		
		JSONObject jsonObj = new JSONObject(dataString);
		data = jsonObj.optString(dataValue);
		
		return data;
	}
}
