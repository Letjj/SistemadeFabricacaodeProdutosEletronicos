package padroescriacao.unificado.singleton;

import padroescriacao.unificado.abstractfactory.Produto;
import java.util.ArrayList;
import java.util.List;

public class CatalogoProdutos {
    private static CatalogoProdutos instancia;
    private List<Produto> produtos;

    private CatalogoProdutos() {
        this.produtos = new ArrayList<>();
    }

    public static synchronized CatalogoProdutos getInstancia() {
        if (instancia == null) {
            instancia = new CatalogoProdutos();
        }
        return instancia;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(this.produtos);
    }

    public int getTotalProdutos() {
        return this.produtos.size();
    }
}