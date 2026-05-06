package cinema;

public class PromoEstudiant implements EstrategiaPromocio {
    private ValidadorEstudiant validador;

    public PromoEstudiant(ValidadorEstudiant validador) {
        this.validador = validador;
    }

    @Override
    public double aplicarDescompte(double preuBase, String clientId) {
        if (validador.verificar(clientId)) {
            return preuBase * 0.75;
        }
        return preuBase;
    }
}
