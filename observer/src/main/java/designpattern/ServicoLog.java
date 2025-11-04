package designpattern;

public class ServicoLog implements UsuarioListener {
    public void usuarioCadastrado(String email) {
        System.out.println("LOG: Registrando auditoria. Ação: CADASTRO, Usuário: " + email);
    }
}
