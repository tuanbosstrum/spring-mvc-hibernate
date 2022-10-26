package com.edu.phuxuan.cntt.k17.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.edu.phuxuan.cntt.k17.demo.repository.ProductRepository;
import com.edu.phuxuan.cntt.k17.demo.repository.ProductRepositoryImpl;
import com.edu.phuxuan.cntt.k17.demo.service.ProductService;
import com.edu.phuxuan.cntt.k17.demo.service.ProductServiceImpl;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "com.edu.phuxuan.cntt.k17.demo"
	})
public class ApplicationConfig {
	@Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }
}
