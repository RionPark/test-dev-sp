package com.dev.sp.mapper;

import java.util.List;

import com.dev.sp.vo.TestVO;

public interface TestMapper {
	int insertTest(TestVO map);
	int updateTest(TestVO map);
	int deleteTest(int tiNum);
	TestVO selectTest(int tiNum);
	List<TestVO> selectTestList(TestVO map);
}
