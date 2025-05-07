package com.dev.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.sp.service.UserService;
import com.dev.sp.vo.UserVO;

@RestController
public class UserController2 {

	@Autowired
	private UserService us;
	
	@GetMapping("/ajax/users")
	public List<UserVO> getUserList(UserVO user){
		return us.selectUserList(user);
	}
	
	@GetMapping("/ajax/users/{uiNum}")
	public UserVO getUser(@PathVariable("uiNum") int uiNum){
		return us.selectUser(uiNum);
	}
	
	@PostMapping("/ajax/users")
	public int addUser(@RequestBody UserVO user){
		return us.insertUser(user);
	}
	
	@PutMapping("/ajax/users")
	public int modifyUser(@RequestBody UserVO user){
		return us.updateUser(user);
	}
	
	@DeleteMapping("/ajax/users/{uiNum}")
	public int addUser(@PathVariable("uiNum") int uiNum){
		return us.deleteUser(uiNum);
	}
}
