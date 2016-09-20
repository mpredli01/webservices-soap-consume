package com.concretepage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.concretepage.wsdl.GetStudentResponse;

public class RunSoapClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ClientAppConfig.class);
        ctx.refresh();
        StudentClient studentClient = ctx.getBean(StudentClient.class);
        System.out.println("For Student Id: 1");
        GetStudentResponse response = studentClient.getStudentById(1);
        System.out.println("Name:" + response.getStudent().getName());
        System.out.println("Age:" + response.getStudent().getAge());
        System.out.println("Class:" + response.getStudent().getClazz());
        }
    }
