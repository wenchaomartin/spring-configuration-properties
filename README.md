1. 把需要配置的信息 单独放进pojo 里面

2. 需要的注解
@ConfigurationProperties(prefix)
1. @configuration

@ConfigurationProperties(prefix)
1.EnableConfigurationProperties

```$java
@Configuration
public class ItemConfiguration {

    @Bean
    @ConfigurationProperties("spring.item")
    public Item item() {
        Item item = new Item();
        return item;
    }
}

```
在申明bean的方法上，使用@configurationProperties
比较优雅