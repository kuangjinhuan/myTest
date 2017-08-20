package com.jinhuan.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jinhuan.springboot.entity.Notice;

/**
 * @ClassName: NoticeDao
 * @Description:公告dao接口
 * @author 邝金焕
 * @date 2017年8月19日 下午7:26:17
 * @version V1.0
 */
@Repository
public interface NoticeDao extends JpaRepository<Notice, Long> {

}
