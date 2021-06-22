import java.util.Date;

public class Funcionario {

    String codFunc;
    String nome;
    String morada;
    String contacto;
    Date dataContacto;

    public void Funcionario(String codFunc, String nome, String morada, String contacto, Date dataContacto){
        this.codFunc = codFunc;
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    };

    public String getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Date getDataContacto() {
        return dataContacto;
    }

    public void setDataContacto(Date dataContacto) {
        this.dataContacto = dataContacto;
    }
}
