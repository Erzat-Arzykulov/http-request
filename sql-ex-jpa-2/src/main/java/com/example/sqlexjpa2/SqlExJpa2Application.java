package com.example.sqlexjpa2;

import com.example.sqlexjpa2.models.Laptop;
import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.InetSocketAddress;

@SpringBootApplication
public class  SqlExJpa2Application {

    public static void main(String[] args) {
		SpringApplication.run(SqlExJpa2Application.class, args);
	}


}
