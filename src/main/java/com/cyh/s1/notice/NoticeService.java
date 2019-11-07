package com.cyh.s1.notice;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cyh.util.DBConnector;

public class NoticeService {

	private NoticeDAO noticeDAO;

	public NoticeService() {
		noticeDAO = new NoticeDAO();
	}




	public List<NoticeDTO>noticeList()throws Exception{

		List<NoticeDTO>ar = noticeDAO.noticeList();

		return ar;

	}

	public NoticeDTO noticeSelect(int num) throws Exception{
		

		
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		return noticeDTO;
	}
	
	
}


