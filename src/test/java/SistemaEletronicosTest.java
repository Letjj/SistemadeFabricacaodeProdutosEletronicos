package padroescriacao.unificado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescriacao.unificado.abstractfactory.*;
import padroescriacao.unificado.singleton.CatalogoProdutos;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaEletronicosTest {

    private CatalogoProdutos catalogo;

    @BeforeEach
    public void setUp() {
        catalogo = CatalogoProdutos.getInstancia();
    }

    @Test
    public void testarAbstractFactorySmartphone() {
        FabricaEletronicos fabrica = new FabricaSmartphone();
        Produto smartphone = new Smartphone(fabrica, "Samsung", "Galaxy S23");

        assertNotNull(smartphone);
        assertEquals("Samsung", smartphone.getMarca());
        assertEquals("Galaxy S23", smartphone.getModelo());
        assertTrue(smartphone.getDetalhes().contains("4500mAh"));
        assertTrue(smartphone.getDetalhes().contains("6.5 polegadas"));
    }

    @Test
    public void testarAbstractFactoryTablet() {
        FabricaEletronicos fabrica = new FabricaTablet();
        Produto tablet = new Tablet(fabrica, "Apple", "iPad Pro");

        assertNotNull(tablet);
        assertEquals("Apple", tablet.getMarca());
        assertEquals("iPad Pro", tablet.getModelo());
        assertTrue(tablet.getDetalhes().contains("8000mAh"));
        assertTrue(tablet.getDetalhes().contains("10.1 polegadas"));
    }

    @Test
    public void testarSingletonCatalogo() {
        CatalogoProdutos catalogo1 = CatalogoProdutos.getInstancia();
        CatalogoProdutos catalogo2 = CatalogoProdutos.getInstancia();

        assertSame(catalogo1, catalogo2, "Singleton deve retornar a mesma instância");
    }

    @Test
    public void testarCatalogoAdicionaProdutos() {
        int totalInicial = catalogo.getTotalProdutos();

        FabricaEletronicos fabrica = new FabricaSmartphone();
        LojaEletronicos loja = new LojaEletronicos(fabrica);
        loja.pedirProduto("Smartphone", "Xiaomi", "Redmi Note");

        assertEquals(totalInicial + 1, catalogo.getTotalProdutos());
    }

    @Test
    public void testarFactoryMethodComponentes() {
        FabricaEletronicos fabricaSmartphone = new FabricaSmartphone();
        FabricaEletronicos fabricaTablet = new FabricaTablet();

        assertNotEquals(fabricaSmartphone.criarBateria().getCapacidade(),
                fabricaTablet.criarBateria().getCapacidade());
        assertNotEquals(fabricaSmartphone.criarTela().getTamanho(),
                fabricaTablet.criarTela().getTamanho());
    }
}
