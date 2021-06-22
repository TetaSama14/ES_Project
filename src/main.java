import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {

    public static void main(String[] args) {

        Interface_Repositorio interface_rep = new RepositorioMemoria();

        Aluno aluno = new Aluno("Joao Antunes","12513","Viseu","joao12513viseu@estgv.com");
        TipoAluno ta1 = new TipoAluno("Tipo 1", 15, 3);

        Livro l1 = new Livro("Eletrónica Automóvel Pt.I","Luís Aragão","Porto Editora", "4185293",LocalDate.parse("16/08/2016", DateTimeFormatter.ofPattern("d/MM/yyyy")));

        Copia copia = new Copia("asd",LocalDate.parse("16/08/2016", DateTimeFormatter.ofPattern("d/MM/yyyy")),false);


        Requisicao requisicao = new Requisicao(LocalDate.now(),aluno,copia);





        interface_rep.adicionaAluno(aluno);







    }
}
