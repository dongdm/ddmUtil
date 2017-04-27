package com.dong.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by dong on 2017/4/25.
 */
@Configuration
@ConfigurationProperties("spring.mail")
@PropertySource("classpath:application.properties")
public class EmailConfig {

    private String defaultEncoding;
    private String host;
    private String password;
    private String port;
    private String protocol;
    private String testConnection;
    private String username;

    public String getDefaultEncoding() {
        return defaultEncoding;
    }

    public void setDefaultEncoding(String defaultEncoding) {
        this.defaultEncoding = defaultEncoding;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getTestConnection() {
        return testConnection;
    }

    public void setTestConnection(String testConnection) {
        this.testConnection = testConnection;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Email{" +
                "defaultEncoding='" + defaultEncoding + '\'' +
                ", host='" + host + '\'' +
                ", password='" + password + '\'' +
                ", port='" + port + '\'' +
                ", protocol='" + protocol + '\'' +
                ", testConnection='" + testConnection + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
