import java.util.ArrayList;

public interface IGerenciadorLivros {
    void adicionarLivro(Livro livro);

    Livro buscarLivroPorCodLivro(int codLivro);

    ArrayList<Livro> getLivros();

    void setLivros(ArrayList<Livro> livros);
}
