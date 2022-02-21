package com.example.demo.repository;

import com.example.demo.model.HelloWorldModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloWorldRepository extends JpaRepository<HelloWorldModel, Long> {

  HelloWorldModel findByLanguage(String language);

}
