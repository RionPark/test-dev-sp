package com.dev.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.sp.service.TestService;
import com.dev.sp.vo.TestVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {
	@Autowired
	private TestService ts;
	
	@GetMapping("/test/ajax/list")
	@ResponseBody
	public List<TestVO> getTestList(TestVO test) {
		return ts.getTestList(test);
	}
	
	@GetMapping("/test/ajax/view")
	@ResponseBody
	public TestVO getTest(@RequestParam("tiNum") int tiNum) {
		return ts.getTest(tiNum);
	}

	@PostMapping("/test/ajax/insert")
	@ResponseBody
	public int inserTest(@RequestBody TestVO test) {
		return ts.insertTest(test);
	}
	@PostMapping("/test/ajax/update")
	@ResponseBody
	public int updateTest(@RequestBody TestVO test) {
		return ts.updateTest(test);
	}
	
	@DeleteMapping("/test/ajax/delete/{tiNum}")
	@ResponseBody
	public int deleteTest(@PathVariable("tiNum")int tiNum) {
		return ts.deleteTest(tiNum);
	}
	
	@GetMapping("/test/list")
	public String getTestList(TestVO test, Model m) {
		List<TestVO> testList = ts.getTestList(test);
		m.addAttribute("list", testList);
		return "/views/test/list";
	}
	
	@GetMapping("/test/view")
	public String getTest(@RequestParam("tiNum") int tiNum, Model m) {
		TestVO test = ts.getTest(tiNum);
		m.addAttribute("test", test);
		return "/views/test/view";
	}
	
	@GetMapping("/test/update")
	public String getTestForUpdate(@RequestParam("tiNum") int tiNum, Model m) {
		TestVO test = ts.getTest(tiNum);
		m.addAttribute("test", test);
		return "/views/test/update";
	}
	
	@PostMapping("/test/insert")
	public String inserTest(@ModelAttribute TestVO test, Model m) {
		m.addAttribute("msg", "등록 실패");
		m.addAttribute("url", "/views/test/insert");
		int result = ts.insertTest(test);
		if(result==1) {
			m.addAttribute("msg", "등록 성공");
			m.addAttribute("url", "/test/list");
		}
		return "/views/common/msg";
	}
	
	@PostMapping("/test/update")
	public String updateTest(@ModelAttribute TestVO test, Model m) {
		m.addAttribute("msg", "수정 실패");
		m.addAttribute("url", "/test/update?tiNum=" + test.getTiNum());
		int result = ts.updateTest(test);
		if(result==1) {
			m.addAttribute("msg", "수정 성공");
			m.addAttribute("url", "/test/view?tiNum=" + test.getTiNum());
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
