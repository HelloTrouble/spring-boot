package oasis.express.superman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SupermanApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello spring boot";
    }


	public static void main(String[] args) {
		SpringApplication.run(SupermanApplication.class, args);
	}
}
