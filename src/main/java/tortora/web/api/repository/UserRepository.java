package tortora.web.api.repository;

import org.springframework.stereotype.Repository;
import tortora.web.api.handler.BusinessException;
import tortora.web.api.handler.CampoRequeridoException;
import tortora.web.api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario) {

        if (usuario.getLogin() == null)
            throw new CampoRequeridoException("login");

        if (usuario.getPassword() == null)
            throw new CampoRequeridoException("password");

        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada repository");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada repository");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para ser deletado", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("fedispato", "123456"));
        usuarios.add(new Usuario("fedispato2", "123654"));
        usuarios.add(new Usuario("fedispato3", "123987"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para ser pesquisado"));
        return new Usuario("fedispato", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo username %s", username));
        return new Usuario("fedispato", "password");
    }

}
