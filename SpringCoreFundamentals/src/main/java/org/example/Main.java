package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.constructordi.AppConfig;
import org.example.constructordi.Employee;


public class Main {


    public static void main(String[] args){
//            ApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//            Employee emp1= ctx.getBean(Employee.class);
//
//            Employee emp2= ctx.getBean(Employee.class);
//            emp1.display();
//            emp2.display();

       ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       Employee emp=ctx.getBean(Employee.class);
       emp.getEmpAddress();

        }

}
