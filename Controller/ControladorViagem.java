

public class ControladorViagem {
    private ModeloViagem modelo;
    private FabricaDestino fabrica;

    public ControladorViagem() {
        modelo = ModeloViagem.getInstancia();
        fabrica = new FabricaDestino();
        modelo.adicionarObservador(new VisaoViagem());
    }

    public void escolherDestino(String nome) {
        Destino destino = fabrica.criarDestino(nome);
        modelo.selecionarDestino(destino);
    }
}