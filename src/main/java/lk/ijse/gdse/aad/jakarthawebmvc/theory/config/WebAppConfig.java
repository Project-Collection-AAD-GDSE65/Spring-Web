package lk.ijse.gdse.aad.jakarthawebmvc.theory.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "lk.ijse.gdse.aad.jakarthawebmvc")
@Configuration
@EnableWebMvc
public class WebAppConfig {

}
