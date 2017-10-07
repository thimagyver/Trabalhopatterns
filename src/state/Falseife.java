package state;

public class Falseife implements Estado {

    @Override
    public void modoGps() {
        System.out.println("Falseife Ativado");
    }

    @Override
    public void modoAtt() {
        System.out.println("Falseife Ativado");
    }

    @Override
    public String getNome() {
        return "FALSEIFIE";
    }

}
