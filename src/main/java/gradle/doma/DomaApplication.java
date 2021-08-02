package gradle.doma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan(value = "gradle.doma")
@ImportResource("classpath:applicationContext-${spring.profiles.active}.xml")
public class DomaApplication {

    public static void main(String[] args) {
        // app.setBannerMode(Mode.OFF); // Disable banner
        SpringApplication.run(DomaApplication.class, args);
    }

}
