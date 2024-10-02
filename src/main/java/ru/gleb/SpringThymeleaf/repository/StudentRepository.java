package ru.gleb.SpringThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gleb.SpringThymeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
