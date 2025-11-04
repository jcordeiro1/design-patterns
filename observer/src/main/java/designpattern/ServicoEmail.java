package designpattern;

public class ServicoEmail implements UsuarioListener {
    public void usuarioCadastrado(String email) {
        System.out.println("EMAIL: Enviando e-mail de boas-vindas para " + email);
    }
}
