// src/main/java/padroescriacao/unificado/Main.java
package padroescriacao.unificado;

import padroescriacao.unificado.abstractfactory.FabricaEletronicos;
import padroescriacao.unificado.abstractfactory.FabricaSmartphone;
import padroescriacao.unificado.abstractfactory.FabricaTablet;
import padroescriacao.unificado.abstractfactory.Produto;
import padroescriacao.unificado.singleton.CatalogoProdutos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Loja de Eletrônicos ===\n");

        // Fábrica de Smartphones
        FabricaEletronicos fabricaSmartphone = new FabricaSmartphone();
        LojaEletronicos lojaSmartphone = new LojaEletronicos(fabricaSmartphone);

        Produto smartphone1 = lojaSmartphone.pedirProduto("Smartphone", "Samsung", "Galaxy S23");
        System.out.println(smartphone1.getDetalhes());
        System.out.println();

        // Fábrica de Tablets
        FabricaEletronicos fabricaTablet = new FabricaTablet();
        LojaEletronicos lojaTablet = new LojaEletronicos(fabricaTablet);

        Produto tablet1 = lojaTablet.pedirProduto("Tablet", "Apple", "iPad Pro");
        System.out.println(tablet1.getDetalhes());
        System.out.println();

        // Singleton - Catálogo
        CatalogoProdutos catalogo = CatalogoProdutos.getInstancia();
        System.out.println("Total de produtos no catálogo: " + catalogo.getTotalProdutos());
        System.out.println("Catálogo possui " + catalogo.listarProdutos().size() + " produtos cadastrados.");
    }
}