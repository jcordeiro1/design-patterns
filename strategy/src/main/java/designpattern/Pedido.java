package designpattern;

public class Pedido {

    private final double pesoKg;

    private final double distanciaKm;

    private final FreteStrategy freteStrategy;

    public Pedido(double pesoKg, double distanciaKm, FreteStrategy freteStrategy) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.freteStrategy = freteStrategy;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double calcularFrete() {
        return freteStrategy.calcularFrete(pesoKg, distanciaKm);
    }
}