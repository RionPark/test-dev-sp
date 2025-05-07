package com.dev.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sp.mapper.TestMapper;
import com.dev.sp.vo.TestVO;

@Service
public class TestService {

	@Autowired
	private TestMapper tm;
	
	public List<TestVO> getTestList(TestVO test){
		return tm.selectTestList(test);
	}
	
	public TestVO getTest(int tiNum){
		return tm.selectTest(tiNum);
	}
	
	public int insertTest(TestVO test){
		return tm.insertTest(test);
	}
	
	public int updateTest(TestVO test){
		return tm.updateTest(test);
	}
	
	public int deleteTest(int tiNum){
		return tm.deleteTest(tiNum);
	}
}
