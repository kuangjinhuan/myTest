package com.jinhuan.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinhuan.springboot.dao.NoticeDao;
import com.jinhuan.springboot.entity.Notice;
import com.jinhuan.springboot.service.NoticeService;

/**
 * @ClassName: NoticeServiceImpl
 * @Description: 公告Service实现类
 * @author 邝金焕
 * @date 2017年8月19日 下午7:30:57
 * @version V1.0
 */
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService{

	/** 注入NoticeDao */
	@Resource
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
