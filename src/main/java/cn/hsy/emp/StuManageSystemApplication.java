package cn.hsy.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.hsy.emp.mapper")
public class StuManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuManageSystemApplication.class, args);
    }

}
