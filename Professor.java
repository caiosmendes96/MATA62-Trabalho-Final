
public final class Professor extends Usuario implements Observador {

    private int contadorNotificacoes;

    public Professor(String nome, int codigo) {
        super(nome, codigo);
        this.definirTempoEmprestimo();
        this.contadorNotificacoes = 0;
    }

    public void definirTempoEmprestimo() {
        super.setTempoEmprestimo(7);
    }

    public void atualizar(Livro livro) {
        contadorNotificacoes++;
        exibirNotificacao(livro);
    }

    public void exibirNotificacao(Livro livro) {
        System.out.println("Professor foi notificado sobre o livro "
                + livro.getTitulo() + " (" + livro.getCodigo() + ").");
    }

    public int getContadorNotificacoes() {
        return contadorNotificacoes;
    }
}
