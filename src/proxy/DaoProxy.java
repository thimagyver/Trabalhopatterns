package proxy;

public class DaoProxy implements Dao {

    private Dao dao;
    private boolean cache;

    public DaoProxy(Dao dao) {
        this.dao = dao;
    }

    @Override
    public boolean BuscaSinalGps() {
        System.out.println("Verificando se tenho sinal de Satelite....");
        if (!cache) {
            cache = dao.BuscaSinalGps();
        }
        return cache;
    }

}
