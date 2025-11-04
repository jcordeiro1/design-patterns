package designpattern;

public class AguardandoPagamento implements EstadoPedido {
    public void submeterPedido(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida neste estado.");
    }

    public void aprovarPagamento(Pedido pedido) {
        pedido.setEstado(new Pago());
        System.out.println("Pagamento Aprovado.");
    }

    public void enviarPedido(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida neste estado.");
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.setEstado(new Cancelado());
        System.out.println("Pedido Cancelado.");
    }
}
