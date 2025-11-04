package designpattern;

import java.util.ArrayList;
import java.util.List;

public class ServicoUsuario {

    private final List<UsuarioListener> listeners = new ArrayList<>();

    public void addListener(UsuarioListener l) {
        listeners.add(l);
    }

    public void removeListener(UsuarioListener l) {
        listeners.remove(l);
    }

    public void cadastrarUsuario(String email, String senha) {
        System.out.println("Salvando usuário " + email + " no banco de dados...");
        for (UsuarioListener l : listeners) {
            l.usuarioCadastrado(email);
        }
        System.out.println("Usuário " + email + " cadastrado com sucesso.");
    }
}
