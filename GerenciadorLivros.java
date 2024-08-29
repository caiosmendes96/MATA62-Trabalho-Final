import java.util.ArrayList;

public final class GerenciadorLivros {

    private static ArrayList<Livro> livros = new ArrayList<>();

    public static ArrayList<Livro> getLivros() {
        return livros;
    }

    public static void setLivros(ArrayList<Livro> livros) {
        GerenciadorLivros.livros = livros;
    }

    public static void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public static Livro buscarLivroPorCodLivro(int codLivro) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codLivro) {
                return livro;
            }
        }
        return null;
    }
}
