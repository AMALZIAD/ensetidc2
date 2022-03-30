package metire;

import metier.Calcul;
import org.junit.Assert;
import org.junit.Test;

public class Calcultest {
    @Test
    public void sommecalcul(){
        Calcul calcul= new Calcul();
        double a= 5; double b=9;
        double expected =14;
        double res =calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
