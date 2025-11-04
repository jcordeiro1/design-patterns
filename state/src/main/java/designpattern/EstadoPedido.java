package designpattern;

public interface EstadoPedido {
    void submeterPedido(Pedido pedido);
    void aprovarPagamento(Pedido pedido);
    void enviarPedido(Pedido pedido);
    void cancelarPedido(Pedido pedido);
}
