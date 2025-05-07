package com.dev.sp.mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper {
	int insertUser(Map<String,String> user);
	int updateUser(Map<String,String> user);
	int deleteUser(int uiNum);
	Map<String,String> selectUser(int uiNum);
	List<Map<String,String>> selectUserList(Map<String,String> user);
}
