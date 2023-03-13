package com.spring.doc;

import com.spring.doc.classes.factoryMethod;
import com.spring.doc.classes.nameBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DocApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(DocApplication.class, args);
//    }
    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

        nameBean bean = (nameBean) appCtx.getBean("testAliasName");

        factoryMethod b = (factoryMethod) appCtx.getBean("initBean");

        System.out.println(b.getMail());
        System.out.println(b.getPass());
        System.out.println();
        bean.foo();
        System.out.println(bean.getClass());
    }
}
