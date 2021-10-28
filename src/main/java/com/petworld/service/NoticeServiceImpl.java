package com.petworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petworld.command.NoticeVO;
import com.petworld.mapper.NoticeMapper;

@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public boolean regist(NoticeVO vo) {
		
		return noticeMapper.regist(vo);
	}

}
