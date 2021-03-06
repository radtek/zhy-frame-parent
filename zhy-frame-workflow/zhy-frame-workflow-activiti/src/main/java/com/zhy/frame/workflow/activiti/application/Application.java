/**
 * 描述:源数据程序入口
 * 包名:com.zhy.pay.gateway.application
 * 版本信息: 版本1.0
 * 日期:2018年9月30日  上午8:51:33
 * Copyright xxxx科技有限公司
 */

package com.zhy.frame.workflow.activiti.application;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


/**
 * @describe：统一网关，springboot主方法
 * @author: lvmoney /xxxx科技有限公司
 * @version:v1.0 2018年9月30日 上午8:51:33
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class, scanBasePackages = {"com.zhy.**"})
@MapperScan(basePackages = {"com.zhy.frame.workflow.activiti.dao"})
@Configuration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
