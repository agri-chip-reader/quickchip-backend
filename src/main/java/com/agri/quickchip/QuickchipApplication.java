package com.agri.quickchip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

//import java.awt.*;
//import com.microsoft.azure.storage.blob.StorageURL;


@SpringBootApplication
@ComponentScan({"controller", "business" , "data"})
@EntityScan("data")
@EnableJpaRepositories("data.repositories")
public class QuickchipApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(QuickchipApplication.class, args);
    }

}
