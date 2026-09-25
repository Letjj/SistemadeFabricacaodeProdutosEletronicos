package padroescriacao.unificado.abstractfactory;

import padroescriacao.unificado.factorymethod.Bateria;
import padroescriacao.unificado.factorymethod.Tela;
import padroescriacao.unificado.factorymethod.Camera;
import padroescriacao.unificado.factorymethod.BateriaTablet;
import padroescriacao.unificado.factorymethod.TelaTablet;
import padroescriacao.unificado.factorymethod.CameraTablet;

public class FabricaTablet implements FabricaEletronicos {
    @Override
    public Bateria criarBateria() {
        return new BateriaTablet();
    }

    @Override
    public Tela criarTela() {
        return new TelaTablet();
    }

    @Override
    public Camera criarCamera() {
        return new CameraTablet();
    }
}

