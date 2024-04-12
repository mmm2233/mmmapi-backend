package com.mmm.mmmapiclientsdk;

import com.mmm.mmmapiclientsdk.client.MmmApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("mmmapi.client")
@Data
@ComponentScan
public class MmmApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public MmmApiClient mmmApiClient() {
        return new MmmApiClient(accessKey, secretKey);
    }

}
