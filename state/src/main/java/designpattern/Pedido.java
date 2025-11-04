package designpattern;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new Rascunho();
        System.out.println("Pedido criado em Rascunho.");
    }

    void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void submeterPedido() {
        estado.submeterPedido(this);
    }

    public void aprovarPagamento() {
        estado.aprovarPagamento(this);
    }

    public void enviarPedido() {
        estado.enviarPedido(this);
    }

    public void cancelarPedido() {
        estado.cancelarPedido(this);
    }
}
