package com.dong.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.util.Properties;

/**
 * Created by dong on 2017/4/25.
 */
@Configuration
public class KaptchaProducer {

    private static Logger LOG = LoggerFactory.getLogger(KaptchaProducer.class);

    @Bean
    public Producer producer(@Autowired KaptchaConfig kaptchaConfig){
        Properties pro = new Properties();
        try{
            ClassPathResource classPathResource = new ClassPathResource("kaptcha.properties");
            pro.load(classPathResource.getInputStream());
        }catch (Exception e){
            LOG.error(e.getMessage());
        }
        Config config = new Config(pro);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

}
