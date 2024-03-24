package org.portalmanagerdementirinha.minhafaqs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CEPConfig {

    @Bean
    public RestTemplate meuRestTemplate(){
        return new RestTemplate();
    }
}
