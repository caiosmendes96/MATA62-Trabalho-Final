public final class GerenciadorBiblioteca {

    private static IGerenciadorEmprestimos gerenciadorEmprestimos = new GerenciadorEmprestimos();
    private static IGerenciadorReservas gerenciadorReservas = new GerenciadorReservas();
    private static IGerenciadorUsuarios gerenciadorUsuarios = new GerenciadorUsuarios();
    private static IGerenciadorLivros gerenciadorLivros = new GerenciadorLivros();

    private GerenciadorBiblioteca() {
    }

    public static IGerenciadorEmprestimos getGerenciadorEmprestimos() {
        return gerenciadorEmprestimos;
    }

    public static void setGerenciadorEmprestimos(IGerenciadorEmprestimos gerenciadorEmprestimos) {
        GerenciadorBiblioteca.gerenciadorEmprestimos = gerenciadorEmprestimos;
    }

    public static IGerenciadorReservas getGerenciadorReservas() {
        return gerenciadorReservas;
    }

    public static void setGerenciadorReservas(IGerenciadorReservas gerenciadorReservas) {
        GerenciadorBiblioteca.gerenciadorReservas = gerenciadorReservas;
    }

    public static IGerenciadorUsuarios getGerenciadorUsuarios() {
        return gerenciadorUsuarios;
    }

    public static void setGerenciadorUsuarios(IGerenciadorUsuarios gerenciadorUsuarios) {
        GerenciadorBiblioteca.gerenciadorUsuarios = gerenciadorUsuarios;
    }

    public static IGerenciadorLivros getGerenciadorLivros() {
        return gerenciadorLivros;
    }

    public static void setGerenciadorLivros(IGerenciadorLivros gerenciadorLivros) {
        GerenciadorBiblioteca.gerenciadorLivros = gerenciadorLivros;
    }

}
