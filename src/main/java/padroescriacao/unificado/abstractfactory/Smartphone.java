package padroescriacao.unificado.abstractfactory;

public class Smartphone extends Produto {
    private FabricaEletronicos fabrica;

    public Smartphone(FabricaEletronicos fabrica, String marca, String modelo) {
        this.fabrica = fabrica;
        this.marca = marca;
        this.modelo = modelo;
        montarProduto();
    }

    @Override
    public void montarProduto() {
        this.bateria = fabrica.criarBateria();
        this.tela = fabrica.criarTela();
        this.camera = fabrica.criarCamera();
    }
}