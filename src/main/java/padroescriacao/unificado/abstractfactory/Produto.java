package padroescriacao.unificado.abstractfactory;

import padroescriacao.unificado.factorymethod.Bateria;
import padroescriacao.unificado.factorymethod.Tela;
import padroescriacao.unificado.factorymethod.Camera;

public abstract class Produto {
    protected String marca;
    protected String modelo;
    protected Bateria bateria;
    protected Tela tela;
    protected Camera camera;


    public abstract void montarProduto();

    public String getDetalhes() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Bateria: " + bateria.getCapacidade() + "\n" +
                "Tela: " + tela.getTamanho() + "\n" +
                "Câmera: " + camera.getResolucao();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
