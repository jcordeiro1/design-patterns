package designpattern;

public class Rascunho implements EstadoPedido {
    public void submeterPedido(Pedido pedido) {
        pedido.setEstado(new AguardandoPagamento());
        System.out.println("Pedido submetido. Aguardando Pagamento.");
    }

    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida neste estado.");
    }

    public void enviarPedido(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida neste estado.");
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.setEstado(new Cancelado());
        System.out.println("Pedido Cancelado.");
    }
}
