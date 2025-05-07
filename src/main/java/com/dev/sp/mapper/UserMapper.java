package com.dev.sp.mapper;

import java.util.List;

import com.dev.sp.vo.UserVO;

public interface UserMapper {
	int insertUser(UserVO user);
	int updateUser(UserVO user);
	int deleteUser(int uiNum);
	UserVO selectUser(int uiNum);
	List<UserVO> selectUserList(UserVO user);
}
