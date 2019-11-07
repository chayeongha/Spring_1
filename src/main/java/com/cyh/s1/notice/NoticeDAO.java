package com.cyh.s1.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cyh.util.DBConnector;

public class NoticeDAO {

		public List<NoticeDTO>noticeList()throws Exception{
			
			
			ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
			
			Connection con= DBConnector.getConnect();
			
			String sql="select * from notice order by num desc";
			
			PreparedStatement st =con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//한줄읽는데rs.next 없을때까지 반복
			while(rs.next()) {
				NoticeDTO noticeDTO =new NoticeDTO();
				
				noticeDTO.setNum(rs.getInt("num"));
				noticeDTO.setTitle(rs.getString("title"));
				noticeDTO.setWriter(rs.getString("writer"));
			/* noticeDTO.setContents(rs.getString("contents")); */
				noticeDTO.setReg_date(rs.getDate("reg_date"));
				noticeDTO.setHit(rs.getInt("hit"));
				
				ar.add(noticeDTO);
				
				
				
			}
			rs.close();
			st.close();
			con.close();
			
			return ar;
			
			
			
		}

		
		public NoticeDTO noticeSelect(int num) throws Exception{
			
			NoticeDTO noticeDTO = null;
			
			Connection con =  DBConnector.getConnect();
			
			String sql="select * from notice where num=?";
			
			PreparedStatement st =con.prepareStatement(sql);
			
			//물음표값 셋팅
			
			st.setInt(1, num);
			
			//최종전송 select는 resultset
			
			ResultSet rs =st.executeQuery();
			
			if(rs.next()) {
				noticeDTO = new NoticeDTO();
				
				noticeDTO.setNum(rs.getInt("num"));
				noticeDTO.setTitle(rs.getString("title"));
				noticeDTO.setWriter(rs.getString("writer"));
				noticeDTO.setContents(rs.getString("contents"));
				noticeDTO.setReg_date(rs.getDate("reg_date"));
				noticeDTO.setHit(rs.getInt("hit"));
				
				
			}
			
			rs.close();
			st.close();
			
			return noticeDTO;
			
		}
		
}
