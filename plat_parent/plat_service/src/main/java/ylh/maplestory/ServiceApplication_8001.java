package ylh.maplestory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication_8001.class,args);
    }
}
