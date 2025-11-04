package designpattern;

public class GerenciadorConexao {

    private static volatile GerenciadorConexao instancia;

    private String conexaoString;
    private boolean conectado;

    private GerenciadorConexao(String config) {
            System.out.println("INICIANDO CONEXÃO CUSTOSA...");
            this.conexaoString = config;
            this.conectado = true;
            System.out.println("Conectado com: " + this.conexaoString);
    }

    public static GerenciadorConexao getInstancia(String config) {
        if (instancia == null) {
            synchronized (GerenciadorConexao.class) {
                if (instancia == null) {
                    instancia = new GerenciadorConexao(config);
                }
            }
        }
        return instancia;
    }

    public void executarQuery(String query) {
        if (conectado) {
            System.out.println("Executando query: " + query + " em " + conexaoString);
        } else {
            System.out.println("Não conectado.");
        }
    }
}
