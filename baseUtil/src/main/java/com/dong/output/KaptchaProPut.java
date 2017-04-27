package com.dong.output;

import com.dong.config.KaptchaConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dong on 2017/4/25.
 */
@Configuration
public class KaptchaProPut implements CommandLineRunner{

    private static final Logger LOG = LoggerFactory.getLogger(KaptchaProPut.class);

    @Autowired
    private KaptchaConfig kaptchaConfig;

    @Override
    public void run(String... strings) throws Exception {
        LOG.info(kaptchaConfig.toString());
    }
}
