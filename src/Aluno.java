public class Aluno {
    private String nome;
    private String numMec;
    private String morada;
    private String email;

    public TipoAluno tipoAluno;

    public Aluno(String nome, String numMec, String morada, String email) {
        this.nome = nome;
        this.numMec = numMec;
        this.morada = morada;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNumMec() {
        return numMec;
    }

    public String getMorada() {
        return morada;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumMec(String numMec) {
        this.numMec = numMec;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }

    public void setTipoAluno(TipoAluno tipoAluno) {
        this.tipoAluno = tipoAluno;
    }
}
