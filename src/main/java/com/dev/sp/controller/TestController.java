package com.dev.sp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.sp.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {
	@Autowired
	private TestService ts;
	
	@GetMapping("/test/list")
	public String getTestList(Map<String,String> map, Model m) {
		List<Map<String,String>> testList = ts.getTestList(map);
		m.addAttribute("list", testList);
		return "/views/test/list";
	}
	
	@GetMapping("/test/view")
	public String getTest(@RequestParam("tiNum") int tiNum, Model m) {
		Map<String,String> test = ts.getTest(tiNum);
		m.addAttribute("test", test);
		return "/views/test/view";
	}
	
	@GetMapping("/test/update")
	public String getTestForUpdate(@RequestParam("tiNum") int tiNum, Model m) {
		Map<String,String> test = ts.getTest(tiNum);
		m.addAttribute("test", test);
		return "/views/test/update";
	}
	
	@PostMapping("/test/insert")
	public String inserTest(@RequestParam Map<String,String> map, Model m) {
		m.addAttribute("msg", "등록 실패");
		m.addAttribute("url", "/views/test/insert");
		int result = ts.insertTest(map);
		if(result==1) {
			m.addAttribute("msg", "등록 성공");
			m.addAttribute("url", "/test/list");
		}
		return "/views/common/msg";
	}
	
	@PostMapping("/test/update")
	public String updateTest(@RequestParam Map<String,String> map, Model m) {
		m.addAttribute("msg", "수정 실패");
		m.addAttribute("url", "/test/update?tiNum=" + map.get("tiNum"));
		int result = ts.updateTest(map);
		if(result==1) {
			m.addAttribute("msg", "수정 성공");
			m.addAttribute("url", "/test/view?tiNum=" + map.get("tiNum"));
		}
		return "/views/common/msg";
	}
	
	@PostMapping("/test/delete")
	public String updateTest(@RequestParam("tiNum") int tiNum, Model m) {
		m.addAttribute("msg", "삭제 실패");
		m.addAttribute("url", "/test/view?tiNum=" + tiNum);
		int result = ts.deleteTest(tiNum);
		if(result==1) {
			m.addAttribute("msg", "삭제 성공");
			m.addAttribute("url", "/test/list");
		}
		return "/views/common/msg";
	}
}
