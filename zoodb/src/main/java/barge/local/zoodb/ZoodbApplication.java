package barge.local.zoodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ZoodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZoodbApplication.class, args);
    }

}
