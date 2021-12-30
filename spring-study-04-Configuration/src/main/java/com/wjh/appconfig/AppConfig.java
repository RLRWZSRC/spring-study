package com.wjh.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.wjh.pojo.User;

/**
 * @author RLRWZSRC
 */
@Configuration
public class AppConfig {

    @Bean
    public User getUser(){
      return new User();
    }
}
