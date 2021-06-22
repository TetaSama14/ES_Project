import java.time.LocalDate;
import java.util.Date;

public class Livro {

    String titulo;
    String autor;
    String editora;
    String isbn;
    LocalDate dataPublicacao;

    public Livro(String titulo, String autor, String editora, String isbn, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
    }
}
