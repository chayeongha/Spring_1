package com.cyh.s1;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cyh.notice.NoticeDTO;
import com.cyh.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	//  /notice/sub/noticeUpdate	
	//write POST방식일때
	
	@Inject
	private NoticeService noticeService;
	
	
	
	
	
	@RequestMapping(value= "noticeWrite" , method=RequestMethod.POST)
	public String noticeWrite2(NoticeDTO noticeDTO) {
		
		
		
		return "redirect:./notice/noticeList";
		
	}
	
	
	
	//write GET방식일때
	@RequestMapping(value =  "noticeWrite" , method=RequestMethod.GET ,params = {"num=1, name=iu ,age"})
	public String noticeWrite() {
		
		return "notice/noticeWrite";
		
	}
	
	
	//selectone
	@RequestMapping( value="noticeSelect" , method = {RequestMethod.GET , RequestMethod.POST})
	public ModelAndView noticeSelect(Model model,@RequestParam(value = "n", required = false , defaultValue = "1") int num  )throws Exception {
	
		NoticeDTO noticeDTO = new NoticeDTO(); 
		
		 noticeDTO=noticeService.noticeSelect(num);
		  
		  ModelAndView mv = new ModelAndView();
		  
		  mv.addObject("dto", noticeDTO); 
		  mv.setViewName("notice/noticeSelect");
		  
		  return mv;
	
	}
	
	//리스트 
	@RequestMapping("noticeList")
	public ModelAndView noticeList()throws Exception {
		// url :  notice/noticeList
		// return"notice/noticeList"; 
		List<NoticeDTO> ar=noticeService.noticeList();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		
		return mv;
		
	}
	
	
	
}
