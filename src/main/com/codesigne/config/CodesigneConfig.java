package main.com.codesigne.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({ "main.com.codesigne" })
@PropertySources({@PropertySource("classpath:ds/database.properties")})
public class CodesigneConfig {

    @Autowired
    ApplicationContext applicationContext;

    private Environment env;

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/views/");
        vr.setSuffix(".jsp");
        return  vr;
    }

    @Bean
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource bds = new DriverManagerDataSource();
        bds.setDriverClassName(env.getProperty("ds.database-driver"));
        bds.setUrl(env.getProperty("ds.url"));
        bds.setUsername(env.getProperty("ds.username"));
        bds.setPassword(env.getProperty("ds.password"));
        return bds;
    }

 




}
