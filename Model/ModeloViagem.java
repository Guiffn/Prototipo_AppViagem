

public class ModeloViagem extends SujeitoDestino {
    private static ModeloViagem instancia;
    private Destino destinoAtual;

    private ModeloViagem() {}

    public static ModeloViagem getInstancia() {
        if (instancia == null) {
            instancia = new ModeloViagem();
        }
        return instancia;
    }

    public void selecionarDestino(Destino destino) {
        this.destinoAtual = destino;
        notificarObservadores(destino);
    }

    public Destino getDestinoAtual() {
        return destinoAtual;
    }
}