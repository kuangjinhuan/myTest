package com.jinhuan.springboot.service;

import java.util.List;

import com.jinhuan.springboot.entity.Notice;

/**
 * @ClassName: NoticeService
 * @Description: 公告Service接口
 * @author 邝金焕
 * @date 2017年8月19日 下午7:30:17
 * @version V1.0
 */
public interface NoticeService {

	/**
	 * 查询所有公告
	 */

	List<Notice> findAll();

}
