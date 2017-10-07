package observer;

import java.util.ArrayList;
import java.util.List;

public class MonitorBateria {

    private Float Bateria;
    private List<Observador> observadores = new ArrayList<>();

    public void setMonitorBateria(Float bateria) {
        this.Bateria = bateria;
        for (Observador observador : observadores) {
            observador.notificar();
        }
    }

    public void addObservador(Observador observador) {
        this.observadores.add(observador);
    }
}
