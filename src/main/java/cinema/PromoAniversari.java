package cinema;

public class PromoAniversari implements EstrategiaPromocio {
    @Override
    public double aplicarDescompte(double preuBase, String clientId) {
        return preuBase * 0.50;
    }
}
