package com.qiao.flyway;

import com.qiao.flyway.domain.Clazz;
import com.qiao.flyway.domain.Student;
import com.qiao.flyway.repository.ClazzRepository;
import com.qiao.flyway.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner init(ClazzRepository clazzRepository, StudentRepository studentRepository) {
        return args -> {
            log.info("Saving Clazz");
            Clazz clazz = new Clazz();
            clazz.setName("二一班 " + System.currentTimeMillis());
            clazzRepository.save(clazz);

            log.info("Saving Student");
            Student student = new Student();
            student.setClazz(clazz);
            student.setName("Joey " + System.currentTimeMillis());
            studentRepository.save(student);
        };
    }
}