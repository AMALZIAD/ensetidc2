package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresStringAnnotation {
    public static void main(String[] args) {
        // utilise construteur avec parametre : injection par construteur
        // ou AUTOWIRED
        // the IDao select the one found or the one with the same name as variable
        // qualifire specify the name of the instance
        ApplicationContext context =
                new AnnotationConfigApplicationContext("dao","metier","ext");
    IMetier metier= context.getBean(IMetier.class);
        System.out.println(metier.calcul());

    }
}
