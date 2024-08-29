import java.util.ArrayList;

public class Livro implements Sujeito {

    private int codigo;
    private String titulo;
    private String editora;
    private String autores;
    private String edicao;
    private int anoPublicacao;
    private ArrayList<Exemplar> exemplares = new ArrayList<>();
    private ArrayList<Observador> observadores;

    public Livro(int codigo, String titulo, String editora, String autores, String edicao, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.observadores = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public ArrayList<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(ArrayList<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public void adicionarExemplar() {
        this.exemplares.add(new Exemplar());
    }

    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(i);
        }
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this);
        }
    }

    public int buscarQuantidadeDeExemplaresDisponiveis() {
        int contador = 0;
        for (Exemplar exemplar : exemplares) {

            if (exemplar.getStatus() instanceof StatusDisponivelExemplar)
                contador++;

        }
        return contador;
    }

    public Exemplar buscarExemplarEmprestadoPorCodLivro(int codLivro) {

        if (exemplares != null) {
            for (Exemplar exemplar : exemplares) {

                if (exemplar.getStatus() instanceof StatusEmprestadoExemplar) {
                    return exemplar;
                }
            }
        }
        return null;

    }

    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }

}
