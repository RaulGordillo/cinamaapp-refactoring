package cinema;

public class PromoSoci implements EstrategiaPromocio {
    private ClubSocisServei socis;

    public PromoSoci(ClubSocisServei socis) {
        this.socis = socis;
    }

    @Override
    public double aplicarDescompte(double preuBase, String clientId) {
        if (socis.esSoci(clientId)) {
            return preuBase * 0.80;
        }
        return preuBase;
    }
}
