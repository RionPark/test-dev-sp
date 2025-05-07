package com.dev.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.sp.service.UserService;
import com.dev.sp.vo.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService us;

	@GetMapping("/user/list")
	public String getUserList(@RequestParam UserVO user, Model m) {
		List<UserVO> userList = us.selectUserList(user);
		m.addAttribute("list", userList);
		return "/views/user/list";
	}
	@GetMapping("/user/view")
	public String getUser(@RequestParam("uiNum") int uiNum, Model m) {
		UserVO user = us.selectUser(uiNum);
		m.addAttribute("user", user);
		return "/views/user/view";
	}
	@GetMapping("/user/update")
	public String getUser2(@RequestParam("uiNum") int uiNum, Model m) {
		UserVO user = us.selectUser(uiNum);
		m.addAttribute("user", user);
		return "/views/user/update";
	}

	@PostMapping("/user/insert")
	public String inserUser(@RequestParam UserVO map, Model m) {
		m.addAttribute("msg", "등록 실패");
		m.addAttribute("url", "/views/user/insert");
		int result = us.insertUser(map);
		if(result==1) {
			m.addAttribute("msg", "등록 성공");
			m.addAttribute("url", "/user/list");
		}
		return "/views/common/msg";
	}

	@PostMapping("/user/delete")
	public String inserUser(@RequestParam("uiNum") int uiNum, Model m) {
		m.addAttribute("msg", "삭제 실패");
		m.addAttribute("url", "/user/view?uiNum="+uiNum);
		int result = us.deleteUser(uiNum);
		if(result==1) {
			m.addAttribute("msg", "삭제 성공");
			m.addAttribute("url", "/user/list");
		}
		return "/views/common/msg";
	}
	@PostMapping("/user/update")
	public String updateUser(@RequestParam UserVO user, Model m) {
		m.addAttribute("msg", "삭제 실패");
		m.addAttribute("url", "/user/update?uiNum="+user.getUiNum());
		int result = us.updateUser(user);
		if(result==1) {
			m.addAttribute("msg", "수정 성공");
			m.addAttribute("url", "/user/view?uiNum="+user.getUiNum());
		}
		return "/views/common/msg";
	}
}
