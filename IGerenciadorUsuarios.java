import java.util.ArrayList;

public interface IGerenciadorUsuarios {
    void adicionarUsuario(Usuario usuario);

    Usuario buscarUsuarioPorCodigo(int codigo);

    ArrayList<Usuario> getUsuarios();

    void setUsuarios(ArrayList<Usuario> usuarios);
}
