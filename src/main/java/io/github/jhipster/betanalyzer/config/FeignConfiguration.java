package io.github.jhipster.betanalyzer.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.github.jhipster.betanalyzer")
public class FeignConfiguration {

}
