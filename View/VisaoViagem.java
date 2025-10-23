
public class VisaoViagem implements ObservadorDestino {
    @Override
    public void atualizar(Destino destino) {
        System.out.println("Destino selecionado: " + destino.getNome() +
                           " | Preço: R$" + destino.getPreco());
    }
}