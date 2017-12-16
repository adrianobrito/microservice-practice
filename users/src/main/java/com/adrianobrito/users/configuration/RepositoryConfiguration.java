package com.adrianobrito.users.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.adrianobrito.users.domain"})
@EnableJpaRepositories(basePackages = {"com.adrianobrito.users.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration { }
