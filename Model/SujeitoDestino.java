
import java.util.ArrayList;
import java.util.List;

public class SujeitoDestino {
    private List<ObservadorDestino> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorDestino observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(Destino destino) {
        for (ObservadorDestino observador : observadores) {
            observador.atualizar(destino);
        }
    }
}