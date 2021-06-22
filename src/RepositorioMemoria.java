import java.util.ArrayList;

public class RepositorioMemoria implements Interface_Repositorio {
    private final ArrayList<Aluno> alunos = new ArrayList<>();
    private final ArrayList<TipoAluno> tipoalunos = new ArrayList<>();
    private final ArrayList<Requisicao> requisicoes = new ArrayList<>();
    private final ArrayList<Copia> copias = new ArrayList<>();
    private final ArrayList<Livro> livros = new ArrayList<>();
    private final ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private final ArrayList<Notificacao> notificacaoes = new ArrayList<>();
    private final ArrayList<Devolucao> devolucoes = new ArrayList<>();
    private final ArrayList<Coima> coimas = new ArrayList<>();



    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.printf("Aluno %s inserido com sucesso",aluno.getNome());
    }

    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
        System.out.println("Aluno removido com sucesso");
    }

    public void adicionaRequisicao(Requisicao requisicao){
        requisicoes.add(requisicao);
    }

    public void adicionaTipoAluno(TipoAluno tipoAluno){
        tipoalunos.add(tipoAluno);
    }

    public void adicionaCopia(Copia copia){
        copias.add(copia);
    }

    public void adicionaLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        devolucoes.add(devolucao);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        notificacaoes.add(notificacao);
    }

    public void adicionaCoima(Coima coima){
        coimas.add(coima);
    }


}
