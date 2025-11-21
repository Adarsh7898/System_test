package com.adarsh.innopandasystemtest.respositories;

import com.adarsh.innopandasystemtest.entities.Student;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Nullable List<Student> findByName(String name);
}
