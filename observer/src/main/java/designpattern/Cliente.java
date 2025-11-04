package designpattern;

public class Cliente {

    public static void main(String[] args) {
        ServicoUsuario servico = new ServicoUsuario();
        servico.addListener(new ServicoEmail());
        servico.addListener(new ServicoLog());
        servico.addListener(new ServicoMetricas());
        servico.cadastrarUsuario("aluno@faculdade.com", "senha123");
    }

}
