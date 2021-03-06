package com.asm.springexample.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
/**
 * Created by LecAnibal on 10/25/17.
 */
@Configuration
public class CustomContainer implements EmbeddedServletContainerCustomizer {


    @java.lang.Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(9091);
    }
}