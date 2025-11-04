package designpattern;

public class Enviado implements EstadoPedido {
    public void submeterPedido(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida neste estado.");
    }

    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida neste estado.");
    }

    public void enviarPedido(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida neste estado.");
    }

    public void cancelarPedido(Pedido pedido) {
        System.out.println("Ação 'cancelar' inválida neste estado.");
    }
}
