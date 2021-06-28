package me.springcofigurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfiguration {

    @Bean
    @ConfigurationProperties("spring.item")
    public Item item() {
        Item item = new Item();
        return item;
    }
}
