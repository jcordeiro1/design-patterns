package designpattern;

public class FretePac implements FreteStrategy {
    @Override
    public double calcularFrete(double peso, double distancia) {
        return 10.0 + (peso * 1.5) + (distancia * 0.10);
    }
    
}
