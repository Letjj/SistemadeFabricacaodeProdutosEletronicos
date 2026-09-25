package padroescriacao.unificado.factorymethod;

public class BateriaSmartphone implements Bateria {
    @Override
    public String getCapacidade() {
        return "Bateria Li-Ion 4500mAh";
    }
}
