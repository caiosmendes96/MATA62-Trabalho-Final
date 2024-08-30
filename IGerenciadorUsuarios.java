import java.util.ArrayList;

public interface IGerenciadorUsuarios {
    public void adicionarUsuario(Usuario usuario);

    public Usuario buscarUsuarioPorCodigo(int codigo);

    public ArrayList<Usuario> getUsuarios();

    public void setUsuarios(ArrayList<Usuario> usuarios);
}
