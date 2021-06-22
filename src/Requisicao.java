import java.time.LocalDate;
import java.util.Date;

public class Requisicao {

    private LocalDate dataHoraReq;
    private Aluno aluno;
    private Copia copia;

    public Requisicao(LocalDate dataHoraReq, Aluno aluno, Copia copia) {
        this.dataHoraReq = dataHoraReq;
        this.aluno = aluno;
        this.copia = copia;
    }

    public LocalDate getDataHoraReq() {
        return dataHoraReq;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Copia getCopia() {
        return copia;
    }
}
