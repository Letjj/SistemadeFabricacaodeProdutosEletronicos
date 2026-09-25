package padroescriacao.unificado;

import padroescriacao.unificado.abstractfactory.FabricaEletronicos;
import padroescriacao.unificado.abstractfactory.Produto;
import padroescriacao.unificado.abstractfactory.Smartphone;
import padroescriacao.unificado.abstractfactory.Tablet;
import padroescriacao.unificado.singleton.CatalogoProdutos;

public class LojaEletronicos {
    private FabricaEletronicos fabrica;

    public LojaEletronicos(FabricaEletronicos fabrica) {
        this.fabrica = fabrica;
    }

    public Produto pedirProduto(String tipo, String marca, String modelo) {
        Produto produto = null;

        if ("Smartphone".equalsIgnoreCase(tipo)) {
            produto = new Smartphone(fabrica, marca, modelo);
        } else if ("Tablet".equalsIgnoreCase(tipo)) {
            produto = new Tablet(fabrica, marca, modelo);
        }

        if (produto != null) {
            CatalogoProdutos catalogo = CatalogoProdutos.getInstancia();
            catalogo.adicionarProduto(produto);
        }

        return produto;
    }
}
