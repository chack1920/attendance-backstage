package com.meterbox.attendance.backstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.meterbox.attendance.backstage.dao"})
public class AttendanceBackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceBackstageApplication.class, args);
    }

}
