import java.util.ArrayList;

public interface IGerenciadorLivros {
   public void adicionarLivro(Livro livro);

   public Livro buscarLivroPorCodLivro(int codLivro);

   public ArrayList<Livro> getLivros();

   public void setLivros(ArrayList<Livro> livros);

   public Exemplar buscarExemplarPorCodExemplar(Livro livro, int codExemplar);
}
