package jash;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
  public static final String ROOT = new File("").getAbsolutePath();
  public static String IMAGE_DIR = ROOT + "/images";

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Application.class);
  }

  public static void main(String[] args) {
    System.out.println("IMAGE_DIR:" + IMAGE_DIR);
    SpringApplication.run(Application.class, args);
  }
}
