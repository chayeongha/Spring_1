package com.cyh.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Autowired
	private DataSource dataSource;

	public List<NoticeDTO> noticeList() throws Exception {

		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();

		
		
		
		
		
		
		

		return ar;

	}

	public NoticeDTO noticeSelect(int num) throws Exception {

		NoticeDTO noticeDTO = null;

		Connection con = dataSource.getConnection();

		String sql = "select * from notice where num=?";

		PreparedStatement st = con.prepareStatement(sql);

		// 물음표값 셋팅

		st.setInt(1, num);

		// 최종전송 select는 resultset

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
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
