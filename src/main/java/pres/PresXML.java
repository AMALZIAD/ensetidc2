package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresXML {
    public static void main(String[] args) {
        // utilise construteur par defaut
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier= (IMetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
