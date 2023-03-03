package com.example.SpringDemo.course.jpa;

import com.example.SpringDemo.course.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext //or Autowired
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }

    public  void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
