package med.voll.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import med.voll.api.entities.usuario.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long>{

    UserDetails findByLogin(String username);
}
