package org.example.config;

import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.example.Xiangyang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@ComponentScan("org.example")
@Configuration
public class AppConfig {
    @Bean(name = {"com2", "desktop"})
    @Scope("prototype")
   public Desktop desktop(){
        return new Desktop();
    }
    public Xiangyang xiangyang(@Qualifier("desktop") Computer com){
        Xiangyang obj = new Xiangyang();
        obj.setAge(40);
        obj.setCom(com);
        return obj;
    }
    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
