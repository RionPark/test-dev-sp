package com.dev.sp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sp.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper um;
	
	public int insertUser(Map<String,String> user) {
		return um.insertUser(user);
	}
	public int updateUser(Map<String,String> user) {
		return um.updateUser(user);
	}
	public int deleteUser(int uiNum) {
		return um.deleteUser(uiNum);
	}
	public Map<String,String> selectUser(int uiNum) {
		return um.selectUser(uiNum);
	}
	public List<Map<String,String>> selectUserList(Map<String,String> user) {
		return um.selectUserList(user);
	}
}
