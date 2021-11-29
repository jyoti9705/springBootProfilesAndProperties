package com.example.profilesAndYMLS.properties;

import com.example.profilesAndYMLS.properties.beans.MyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class MyConfiguration {


    @Bean
    public MyDataSource myDataSource(@Value("${myDataSource.userName}") String userName, @Value("${myDataSource.password}") String passWord) {
        MyDataSource myDataSourceReturned = new MyDataSource();
        myDataSourceReturned.setPassword(passWord);
        myDataSourceReturned.setUserName(userName);
        System.out.println("UserName " + myDataSourceReturned.getUserName() + " and Password : " + myDataSourceReturned.getPassword());
        return myDataSourceReturned;
    }
}
