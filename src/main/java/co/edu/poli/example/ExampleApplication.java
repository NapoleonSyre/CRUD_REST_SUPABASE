package co.edu.poli.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {


        String user = System.getenv("DB_USER_SUPABASE");
        String pass = System.getenv("DB_PWD_SUPABASE");

       
        System.out.println("DB_USER_SUPABASE = " + user);
        System.out.println("DB_PWD_SUPABASE = " + (pass != null ? "********" : "NO DEFINIDA"));

        // Iniciar Spring Boot
		SpringApplication.run(ExampleApplication.class, args);
	}

}
