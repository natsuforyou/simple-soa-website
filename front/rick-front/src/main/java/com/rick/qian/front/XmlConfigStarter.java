/*
 * ©2016 Rick Qian. some rights reserved.
 */

package com.rick.qian.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@Configuration
@ImportResource("classpath:spring/rick-front-*.xml")
public class XmlConfigStarter implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {
        SpringApplication.run(XmlConfigStarter.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }
}