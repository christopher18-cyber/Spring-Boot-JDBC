package com.genius;

import com.genius.model.Alien;
import com.genius.model.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(Main.class,args);

        Alien alien1 = context.getBean(Alien.class);
//        alien1.setId(101);
//        alien1.setName("Abraham");
//        alien1.setTech("Java");

        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(alien1);
        System.out.println(repo.findAll());
    }
}