package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Xiangyang {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Autowired
    @Qualifier("com2")
    private Computer com;
    @Value("90")
    private int age = 29;

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


    public Xiangyang(){
        System.out.println("Object Created");
    }
   @ConstructorProperties({"laptop", "age"})
    public Xiangyang(Computer com, int age) {
       this.com = com;
        this.age = age;
    }

    public Xiangyang(int age){
        System.out.println("Para Constructor Called");
        this.age = age;
    }
    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
