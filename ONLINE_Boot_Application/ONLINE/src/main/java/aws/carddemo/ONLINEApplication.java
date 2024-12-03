package aws.carddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@Import(com.tmax.openframe.OpenFrameOnlineConfig.class)
@SpringBootApplication
public class ONLINEApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ONLINEApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(ONLINEApplication.class);
  }
}

