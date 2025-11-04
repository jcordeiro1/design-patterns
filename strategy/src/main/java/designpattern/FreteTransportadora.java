package designpattern;

public class FreteTransportadora implements FreteStrategy {
    @Override
    public double calcularFrete(double peso, double distancia) {
        double taxaBase = 50.0;
        double volume = (peso / 5.0);
        return taxaBase + (volume * 10.0) + (distancia * 0.05);
    }
    
}
