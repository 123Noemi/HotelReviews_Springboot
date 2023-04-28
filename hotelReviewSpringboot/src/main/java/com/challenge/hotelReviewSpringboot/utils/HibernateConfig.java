package com.challenge.hotelReviewSpringboot.utils;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class HibernateConfig {
	/*@Autowired
    private Environment env;*/

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
       
        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl("jdbc:sqlite:C:\\Users\\Noemi\\Desktop\\Challenge\\DataBase\\HotelReviews.db");
     
        //dataSource.setDriverClassName(env.getProperty("driverClassName"));
        //dataSource.setUrl(env.getProperty("url"));


        return dataSource;
    }


}
