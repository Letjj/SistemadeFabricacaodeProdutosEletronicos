package padroescriacao.unificado.abstractfactory;

import padroescriacao.unificado.factorymethod.Bateria;
import padroescriacao.unificado.factorymethod.Tela;
import padroescriacao.unificado.factorymethod.Camera;

public interface FabricaEletronicos {
    Bateria criarBateria();
    Tela criarTela();
    Camera criarCamera();
}

