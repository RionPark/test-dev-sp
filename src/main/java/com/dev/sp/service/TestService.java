package com.dev.sp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sp.mapper.TestMapper;

@Service
public class TestService {

	@Autowired
	private TestMapper tm;
	
	public List<Map<String,String>> getTestList(Map<String,String> map){
		return tm.selectTestList(map);
	}
	
	public Map<String,String> getTest(int tiNum){
		return tm.selectTest(tiNum);
	}
	
	public int insertTest(Map<String,String> map){
		return tm.insertTest(map);
	}
	
	public int updateTest(Map<String,String> map){
		return tm.updateTest(map);
	}
	
	public int deleteTest(int tiNum){
		return tm.deleteTest(tiNum);
	}
}
