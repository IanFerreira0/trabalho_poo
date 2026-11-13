import java.time.LocalDate;

public class Treinador extends Pessoa {
    private String registroCBF;
    private String esquemaTaticoPreferido;

    public Treinador() {
        super();
    }

    public Treinador(int id, String nome, String cpf, LocalDate dataNascimento, String registroCBF, String esquemaTaticoPreferido) {
        super(id, nome, cpf, dataNascimento);
        this.registroCBF = registroCBF;
        this.esquemaTaticoPreferido = esquemaTaticoPreferido;
    }

    public String getRegistroCBF() { return registroCBF; }
    public void setRegistroCBF(String registroCBF) { this.registroCBF = registroCBF; }

    public String getEsquemaTaticoPreferido() { return esquemaTaticoPreferido; }
    public void setEsquemaTaticoPreferido(String esquemaTaticoPreferido) { this.esquemaTaticoPreferido = esquemaTaticoPreferido; }

    @Override
    public String toString() {
        return nome + " (CBF: " + registroCBF + ")";
    }
}