package com.example.soapspringclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import proxy.EtudiantWService;
import proxy.ServiceWeb;

@SpringBootApplication
public class SoapSpringClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapSpringClientApplication.class, args);
    }

    @Bean(name = "service")
    EtudiantWService etudiantWService(){
        return new ServiceWeb().getEtudiantWServicePort();
    }

}
