package designpattern;

public class ServicoMetricas implements UsuarioListener {
    public void usuarioCadastrado(String email) {
        System.out.println("METRICAS: Incrementando contador de novos usuários.");
    }
}
