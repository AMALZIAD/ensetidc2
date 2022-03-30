package dao;

import org.springframework.stereotype.Component;

@Component("dao1")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        recuperation de la velaue r de temperature depuis DB
         */
        double temp= Math.random()*40;
        return temp;
    }
}
