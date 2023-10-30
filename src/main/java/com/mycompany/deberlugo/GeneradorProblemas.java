import java.security.SecureRandom;

public class GeneradorProblemas {
    private final int nivelDificultad;
    private final int tipoProblema;
    private final SecureRandom random;

    public GeneradorProblemas(int nivelDificultad, int tipoProblema) {
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
        this.random = new SecureRandom();
    }
}