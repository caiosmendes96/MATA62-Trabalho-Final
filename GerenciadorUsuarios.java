import java.util.ArrayList;

public final class GerenciadorUsuarios implements IGerenciadorUsuarios {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario buscarUsuarioPorCodigo(int codigo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    @Override
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        GerenciadorUsuarios.usuarios = usuarios;
    }
}
