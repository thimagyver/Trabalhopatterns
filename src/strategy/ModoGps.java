package strategy;

import proxy.BuscaGps;
import proxy.Dao;
import proxy.DaoProxy;

public class ModoGps implements ModoVoo {

    Dao dao = new DaoProxy(new BuscaGps());

    @Override
    public void modovoo() {
        System.out.println("Buscando...");
        System.out.println(dao.BuscaSinalGps());
        System.out.println("Buscando novamente...");
        System.out.println(dao.BuscaSinalGps());
        System.out.println("Buscando terceira vez...");
        System.out.println(dao.BuscaSinalGps());
        System.out.println("AGORA PEGUEI SINAL DE GPS");
    }

}
