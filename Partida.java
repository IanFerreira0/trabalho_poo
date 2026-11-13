import java.time.LocalDateTime;

public class Partida {
    private int id;
    private LocalDateTime dataHora;
    private String timeAdversario;
    private String local;

    public Partida(int id, LocalDateTime dataHora, String timeAdversario, String local) {
        this.id = id;
        this.dataHora = dataHora;
        this.timeAdversario = timeAdversario;
        this.local = local;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getTimeAdversario() { return timeAdversario; }
    public void setTimeAdversario(String timeAdversario) { this.timeAdversario = timeAdversario; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
}