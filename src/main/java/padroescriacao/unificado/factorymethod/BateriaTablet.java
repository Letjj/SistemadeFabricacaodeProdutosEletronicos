package padroescriacao.unificado.factorymethod;

public class BateriaTablet implements Bateria {
    @Override
    public String getCapacidade() {
        return "Bateria Li-Po 8000mAh";
    }
}
