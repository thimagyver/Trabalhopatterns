/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dronegirassol;

import observer.Celular;
import observer.MonitorBateria;
import state.Estado;
import state.Falseife;
import state.Normal;
import strategy.ModoVoo;

/**
 *
 * @author Thiago
 */
public class Drone {

    private ModoVoo modo;
    private Estado estado;
    private MonitorBateria m = new MonitorBateria();

    public Drone() {
        this.estado = new Normal();
        m.addObservador(new Celular());
    }

    public void setEstado(Estado novoEstado) {
        estado = novoEstado;
    }

    public void gps() {
        estado.modoGps();
    }

    public void att() {
        estado.modoAtt();
    }

    void modoGps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void voar() {
        modo.modovoo();
        m.setMonitorBateria(11.5f);
    }

    public void setModoVoar(ModoVoo novoModo) {
        modo = novoModo;
    }

    void chaveEstado() {
        if ("NORMAL" == estado.getNome()) {
            setEstado(new Falseife());
        } else {
            setEstado(new Normal());
        }

    }

}
