package orius123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class JcommanderApp implements CommandLineRunner {
    
    @Override
	public void run(String... args) {
		System.out.println("hi");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JcommanderApp.class, args);
	}
}
