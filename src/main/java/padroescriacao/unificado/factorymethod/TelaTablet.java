package padroescriacao.unificado.factorymethod;

public class TelaTablet implements Tela {
    @Override
    public String getTamanho() {
        return "Tela IPS LCD 10.1 polegadas";
    }
}