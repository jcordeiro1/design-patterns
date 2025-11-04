package designpattern;

public class Pago implements EstadoPedido {
    public void submeterPedido(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida neste estado.");
    }

    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida neste estado.");
    }

    public void enviarPedido(Pedido pedido) {
        pedido.setEstado(new Enviado());
        System.out.println("Pedido Enviado.");
    }

    public void cancelarPedido(Pedido pedido) {
        System.out.println("Não pode cancelar, pedido já aprovado. Iniciando estorno...");
        pedido.setEstado(new Cancelado());
    }
}
