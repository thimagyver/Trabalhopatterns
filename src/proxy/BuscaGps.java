package proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscaGps implements Dao {

    @Override
    public boolean BuscaSinalGps() {
        System.out.println("Buscando Sinal GPS....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuscaGps.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}
