import java.time.LocalDate;
import java.util.Date;

public class Copia {

    String cota;
    LocalDate dataEntrada;
    Boolean danificado;

    public Copia(String cota, LocalDate dataEntrada, Boolean danificado) {
        this.cota = cota;
        this.dataEntrada = dataEntrada;
        this.danificado = danificado;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }
}
