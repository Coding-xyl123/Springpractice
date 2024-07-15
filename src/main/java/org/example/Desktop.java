package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class Desktop implements Computer{
   public Desktop(){
       System.out.println("Desktop Object Created..");
   }
    @Override
    public void compile() {
        System.out.println("This is a Desktop");
    }
}
