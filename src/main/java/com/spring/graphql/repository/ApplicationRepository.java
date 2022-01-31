package com.spring.graphql.repository;

import com.spring.graphql.entity.Application;

import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
