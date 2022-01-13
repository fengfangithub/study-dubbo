package cn.fengfan.sbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config/spring.xml")
public class DubooConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubooConsumerApplication.class, args);
    }

}
