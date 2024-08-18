import java.util.ArrayList;
import java.util.List;

public class Livro {

    private int codigo;
    private String titulo;
    private String editora;
    private String autores;
    private String edicao;
    private int anoPublicacao;
    private List<Exemplar> examplares = new ArrayList<>();

 

    public Livro(int codigo, String titulo,String editora,String autores,String edicao,int anoPublicacao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
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

    public List<Exemplar> getExamplares() {
        return examplares;
    }

    public void setExamplares(List<Exemplar> examplares) {
        this.examplares = examplares;
    }

    public void adicionarExemplar(Exemplar exemplar){
        this.examplares.add(exemplar);
    }

    public String toString() {
        return "Codigo: " + this.codigo + "\n" + "Titulo: " + this.titulo + "\n" +  "Editora: " + this.editora  + "\n" + "Autores: " + this.autores + "\n" + "Edição: " + 
        this.edicao + "\n" +"Ano de publicação:" + this.anoPublicacao + "\n";
    }

}
