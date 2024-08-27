public interface IComandoObservador {
    void executarRegistroObservador(int codUsuario, int codLivro);

    void executarConsultaNotificacoes(int codUsuario);
}
