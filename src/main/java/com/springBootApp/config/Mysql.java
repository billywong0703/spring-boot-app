package com.springBootApp.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class Mysql {

/*    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        return new LocalSessionFactoryBean();
    }*/

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("test1234");
        dataSource.setUrl("jdbc:mysql://localhost:3306/user");

        return dataSource;
    }

}
