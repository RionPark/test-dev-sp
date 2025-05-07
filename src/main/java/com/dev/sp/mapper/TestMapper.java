package com.dev.sp.mapper;

import java.util.List;
import java.util.Map;

public interface TestMapper {
	int insertTest(Map<String,String> map);
	int updateTest(Map<String,String> map);
	int deleteTest(int tiNum);
	Map<String,String> selectTest(int tiNum);
	List<Map<String,String>> selectTestList(Map<String,String> map);
}
