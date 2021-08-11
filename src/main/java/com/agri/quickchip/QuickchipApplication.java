package com.agri.quickchip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import java.awt.*;
//import com.microsoft.azure.storage.blob.StorageURL;


@SpringBootApplication
@ComponentScan({"controller", "business" , "data"})
@EntityScan("data")
@EnableJpaRepositories("data.repositories")
public class QuickchipApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickchipApplication.class, args);
    }

}
/*
class ObjectStoregeServicesDemo{
    ObjectStoregeServicesDemo(@Value("classpath:/agrilogo.png") Resource resource, ContainerURL){
    }
}*/