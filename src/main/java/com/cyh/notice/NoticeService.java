package com.cyh.notice;

import java.sql.Connection;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;



@Service
public class NoticeService {

	@Inject
	private NoticeDAO noticeDAO;




	public List<NoticeDTO>noticeList()throws Exception{

		List<NoticeDTO>ar = noticeDAO.noticeList();

		return ar;

	}

	public NoticeDTO noticeSelect(int num) throws Exception{
		

		
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		return noticeDTO;
	}
	
	
}


