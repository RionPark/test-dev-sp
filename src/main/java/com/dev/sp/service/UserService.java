package com.dev.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sp.mapper.UserMapper;
import com.dev.sp.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserMapper um;
	
	public int insertUser(UserVO user) {
		return um.insertUser(user);
	}
	public int updateUser(UserVO user) {
		return um.updateUser(user);
	}
	public int deleteUser(int uiNum) {
		return um.deleteUser(uiNum);
	}
	public UserVO selectUser(int uiNum) {
		return um.selectUser(uiNum);
	}
	public List<UserVO> selectUserList(UserVO user) {
		return um.selectUserList(user);
	}
}
