
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "controllers")
@SpringBootApplication
public class CactusApplication {

    public static void main(String[] args) {
        SpringApplication.run(CactusApplication.class, args);
    }

}

