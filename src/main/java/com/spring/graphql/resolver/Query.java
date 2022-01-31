package com.spring.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.graphql.entity.Application;
import com.spring.graphql.repository.ApplicationRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private ApplicationRepository applicationRepository;

    public Query(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }
}
