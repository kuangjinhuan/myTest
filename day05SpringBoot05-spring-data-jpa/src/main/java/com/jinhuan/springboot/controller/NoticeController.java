package com.jinhuan.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinhuan.springboot.entity.Notice;
import com.jinhuan.springboot.service.NoticeService;

/**
 * @ClassName: NoticeController
 * @Description: 公告Controller
 * @author 邝金焕
 * @date 2017年8月19日 下午7:31:28
 * @version V1.0
 */
@RestController
public class NoticeController {

	/** 注入NoticeService */
	@Resource
	private NoticeService noticeService;

	@GetMapping("/findAll")
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
}
