package padroescriacao.unificado.factorymethod;

public class CameraSmartphone implements Camera {
    @Override
    public String getResolucao() {
        return "Câmera Tripla 48MP + 12MP + 5MP";
    }
}