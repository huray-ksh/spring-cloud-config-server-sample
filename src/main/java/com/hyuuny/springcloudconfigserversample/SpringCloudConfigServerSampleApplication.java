package com.hyuuny.springcloudconfigserversample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerSampleApplication.class, args);
    }

}
