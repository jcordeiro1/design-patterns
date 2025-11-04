package designpattern;

public class Cliente {

    public static void main(String[] args) {
        FreteStrategy freteStrategy = new FreteTransportadora();
        FreteStrategy freteStrategy2 = new FreteSedex();
        FreteStrategy freteStrategy3 = new FretePac();

        Pedido p1 = new Pedido(2.5, 100.0, freteStrategy);
        Pedido p2 = new Pedido(1.0, 50.0, freteStrategy2);
        Pedido p3 = new Pedido(3.0, 200.0, freteStrategy3);

        System.out.println("Frete do pedido 1: R$ " + p1.calcularFrete());
        System.out.println("Frete do pedido 2: R$ " + p2.calcularFrete());
        System.out.println("Frete do pedido 3: R$ " + p3.calcularFrete());
    }
}
