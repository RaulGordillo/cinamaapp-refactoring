import java.util.ArrayList;

public enum TipusReserva { ESTANDARD, PREESTRENA, VIP }

public class GestorReserves {
    
    // Constantes extraídas del código legado
    private static final double DESCOMPTE_PREESTRENA = 0.85;
    private static final double BONUS_GRUP_GRAN = 0.95;
    private static final double DESCOMPTE_VIP = 0.70;
    private static final int MIDA_GRUP_GRAN = 8;

    private ArrayList<int[]> reservesRegistrades = new ArrayList<>();

    public boolean reservar(TipusReserva tipus, int[] seients, double preuPerSeient) {
        // Cláusula de guarda: comprueba errores al principio y sale rápido
        if (seients == null || seients.length == 0) {
            return false;
        }

        double total = calcularTotal(tipus, seients.length, preuPerSeient);
        registrarReserva(seients);
        mostrarResum(tipus, seients.length, total);
        
        return true;
    }

    private double calcularTotal(TipusReserva tipus, int numSeients, double preuBase) {
        double total = preuBase * numSeients;
        
        if (tipus == TipusReserva.PREESTRENA) {
            total = total * DESCOMPTE_PREESTRENA;
            if (numSeients >= MIDA_GRUP_GRAN) {
                total = total * BONUS_GRUP_GRAN;
            }
        } else if (tipus == TipusReserva.VIP) {
            total = total * DESCOMPTE_VIP;
        }
        
        return total;
    }

    private void registrarReserva(int[] seients) {
        reservesRegistrades.add(seients);
    }

    private void mostrarResum(TipusReserva tipus, int numSeients, double total) {
        System.out.println("T: " + tipus);
        System.out.println("Nse: " + numSeients);
        System.out.println("Tot: " + total);
    }
}
