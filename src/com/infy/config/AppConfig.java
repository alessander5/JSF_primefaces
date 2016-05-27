package com.infy.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Infy on 27.05.2016.
 */

@Configuration
@ComponentScan("com.infy")
public class AppConfig {

    /*@Bean(name = "fileInfoDao")
     public IFileInfoDao getFileInfoDao(){
        return new MockFileInfoDaoImpl();
    }

    @Bean(name = "mobyDao")
    public ITopTableDao getMobyDao(){
        return new MockTopTableDaoImpl();
    }

    @Bean(name = "fileService")
    public IFileInfoService getFileService(){
        return new FileInfoServiceImpl();
    }

    @Bean(name = "mobyService")
    public ITopTableService getMobyService(){
        return new TopTableServiceImpl();
    }*/
}
