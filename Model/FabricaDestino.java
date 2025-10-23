

public class FabricaDestino {
    public Destino criarDestino(String nome) {
        switch (nome.toLowerCase()) {
            case "paris": return new Destino("Paris", 1200.0);
            case "tóquio": return new Destino("Tóquio", 1500.0);
            case "rio": return new Destino("Rio de Janeiro", 800.0);
            default: return new Destino("Desconhecido", 0.0);
        }
    }
}