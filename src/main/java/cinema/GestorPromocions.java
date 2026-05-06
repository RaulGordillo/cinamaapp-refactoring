package cinema;

public class GestorPromocions {
    // S'utilitza la injecció de dependències a través del paràmetre del mètode
    public double aplicarPromocio(Entrada entrada, EstrategiaPromocio estrategia) {
        return estrategia.aplicarDescompte(entrada.getPreuBase(), entrada.getClientId());
    }
}
