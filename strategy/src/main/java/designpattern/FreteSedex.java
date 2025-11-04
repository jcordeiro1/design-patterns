package designpattern;

public class FreteSedex implements FreteStrategy {
    @Override
    public double calcularFrete(double peso, double distancia) {
        return 25.0 + (peso * 3.0) + (distancia * 0.20);
    }
    
}
