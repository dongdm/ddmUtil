package com.dong.output;

import com.dong.config.EmailConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dong on 2017/4/25.
 */
@Configuration
public class EmailProOut implements CommandLineRunner{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailProOut.class);

    @Autowired
    private EmailConfig emailConfig;

    public void run(String... args) throws Exception {
        LOGGER.info(emailConfig.toString());
    }
}
