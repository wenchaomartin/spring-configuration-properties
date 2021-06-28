package me.springcofigurationproperties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class SpringConfigurationPropertiesApplication implements ApplicationContextAware {

    @Autowired
    private EmailAutoConfiguration emailAutoConfiguration;

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    Item item;

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigurationPropertiesApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println(applicationContext);
        System.out.println(emailAutoConfiguration.getHost());
        System.out.println(emailAutoConfiguration.getPort());
        System.out.println(emailAutoConfiguration.getTo());
        System.out.println(emailAutoConfiguration.getCredential().getPassword());
        System.out.println(emailAutoConfiguration.getCredential().getUsername());
        System.out.println(item.getName());
        System.out.println(item.getSize());
    }
}
