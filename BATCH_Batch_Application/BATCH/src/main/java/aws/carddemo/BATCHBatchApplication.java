package aws.carddemo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class BATCHBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(BATCHBatchApplication.class, args);
    }
}
