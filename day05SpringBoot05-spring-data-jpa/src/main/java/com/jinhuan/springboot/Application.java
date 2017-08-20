package com.jinhuan.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * @ClassName: Application 
 * @Description: SpringBoot启动类 
 * @author 邝金焕 
 * @date 2017年8月18日 下午8:44:23 
 * @version V1.0 
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}
}
