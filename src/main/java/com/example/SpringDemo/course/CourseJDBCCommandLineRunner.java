package com.example.SpringDemo.course;

import com.example.SpringDemo.course.jdbc.CreateJdbcRepository;
import com.example.SpringDemo.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CreateJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Beyto1", "Beşikten Mezara"));
        repository.insert(new Course(2, "Beyto2", "Beşikten Mezara"));
        repository.insert(new Course(3, "Beyto3", "Beşikten Mezara"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
    }
}
