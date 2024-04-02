package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app") // путь по которому Спринг будет искать классы для создания бинов
public class AppConfig {
}
