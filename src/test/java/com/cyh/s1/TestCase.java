package com.cyh.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cyh.notice.NoticeDAO;


public class TestCase extends TestAbstractCase {

	@Inject
	private NoticeDAO noticeDAO; 
	
	@Test
	public void test() throws Exception{
		assertNotNull(noticeDAO);
	}

}

