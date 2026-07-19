package com.keyin.hynes.braden.mongoboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
@SpringBootApplication
@EnableMongoAuditing
@ComponentScan(basePackages = {
  "com.keyin.hynes.braden.mongoboot.controllers",
  "com.keyin.hynes.braden.mongoboot.interfaces.repositories",
  "com.keyin.hynes.braden.mongoboot.services"
})
public class App {
  public static void main(final String[] args) {
    SpringApplication.run(
      App.class,
      args
    );
  }
}