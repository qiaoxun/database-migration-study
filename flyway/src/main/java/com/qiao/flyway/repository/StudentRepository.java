package com.qiao.flyway.repository;

import com.qiao.flyway.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
