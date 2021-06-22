import java.util.Date;

public class Notificacao {

    String codNotific;
    Date dataHoraNot;
    String email;

    public Notificacao(String codNotific, Date dataHoraNot, String email) {
        this.codNotific = codNotific;
        this.dataHoraNot = dataHoraNot;
        this.email = email;
    }

    public String getCodNotific() {
        return codNotific;
    }

    public void setCodNotific(String codNotific) {
        this.codNotific = codNotific;
    }

    public Date getDataHoraNot() {
        return dataHoraNot;
    }

    public void setDataHoraNot(Date dataHoraNot) {
        this.dataHoraNot = dataHoraNot;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
