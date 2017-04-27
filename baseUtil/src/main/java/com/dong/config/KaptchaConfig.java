package com.dong.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dong on 2017/4/25.
 */
@Configuration
@ConfigurationProperties(prefix = "kaptcha.image",locations = "classpath:kaptcha.properties")
public class KaptchaConfig {

    private String width;
    private String height;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "KaptchaConfig{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
