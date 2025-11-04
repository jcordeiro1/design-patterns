package designpattern;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("cliente 1...");
        GerenciadorConexao db1 = GerenciadorConexao.getInstancia("jdbc:mysql://servidor1/db");
        db1.executarQuery("SELECT * FROM usuarios");

        GerenciadorConexao db2 = GerenciadorConexao.getInstancia("jdbc:postgres://servidor2/db");
        db2.executarQuery("SELECT * FROM produtos");

        System.out.println("cliente 1 tentando usar a conexão novamente...");
        db1.executarQuery("SELECT * FROM pedidos");
    }
}
