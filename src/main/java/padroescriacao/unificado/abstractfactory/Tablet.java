package padroescriacao.unificado.abstractfactory;

public class Tablet extends Produto {
    private FabricaEletronicos fabrica;

    public Tablet(FabricaEletronicos fabrica, String marca, String modelo) {
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
