package lk.ijse.car.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
//@ComponentScan(basePackageClasses = )
public class WebRootConfig {
}