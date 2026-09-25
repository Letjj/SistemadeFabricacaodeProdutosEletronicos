package padroescriacao.unificado.abstractfactory;

import padroescriacao.unificado.factorymethod.Bateria;
import padroescriacao.unificado.factorymethod.Tela;
import padroescriacao.unificado.factorymethod.Camera;
import padroescriacao.unificado.factorymethod.BateriaSmartphone;
import padroescriacao.unificado.factorymethod.TelaSmartphone;
import padroescriacao.unificado.factorymethod.CameraSmartphone;

public class FabricaSmartphone implements FabricaEletronicos {
    @Override
    public Bateria criarBateria() {
        return new BateriaSmartphone();
    }

    @Override
    public Tela criarTela() {
        return new TelaSmartphone();
    }

    @Override
    public Camera criarCamera() {
        return new CameraSmartphone();
    }
}
