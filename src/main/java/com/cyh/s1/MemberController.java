package com.cyh.s1;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.cyh.s1.member.MemberDTO;


@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	
	//MEMBER JOIN
	
	@RequestMapping(value="memberJoin" )
	public void memberJoin() {
		
		
		
		
	}
	
	//MEMBER JOIN RESULT
	@RequestMapping(value="memberJoinResult" ,method=RequestMethod.POST)
	public ModelAndView memberJoinResult( ) {
		
		ModelAndView mv = new ModelAndView();
		String msg = "성공";
		String path = "/s1";
		mv.addObject("msg", msg);
		mv.addObject("path", path);
		mv.setViewName("common/common_result");
		
		return mv;
		
		
	}
	

	//MEMBER LOGIN
	
	@RequestMapping(value="memberLogin")
	public void memberLogin(MemberDTO memberDTO) {
		
		
	}
	
	//MEMBER LOGIN RESULT
	@RequestMapping(value="memberLoginResult")
	public void memberLoginResult() {
		
		
	}
		
}
