import java.util.ArrayList;

public final class GerenciadorLivros implements IGerenciadorLivros {

    private static ArrayList<Livro> livros = new ArrayList<>();

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Livro buscarLivroPorCodLivro(int codLivro) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codLivro) {
                return livro;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    @Override
    public void setLivros(ArrayList<Livro> livros) {
        GerenciadorLivros.livros = livros;
    }
}
