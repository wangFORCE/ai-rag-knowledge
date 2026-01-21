package cn.wang.dev.tech;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WangBigGun
 * @description
 * @create 2026-01-21 20:06
 */
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        System.out.println(Application.class.getClassLoader().getResource("logback-spring.xml"));
        SpringApplication.run(Application.class);
    }
}
