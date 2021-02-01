package bd.edu.seu.rediscashwithmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisCashWithMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCashWithMongoDbApplication.class, args);
    }

}
