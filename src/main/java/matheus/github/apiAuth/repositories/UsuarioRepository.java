package matheus.github.apiAuth.repositories;

import matheus.github.apiAuth.models.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

     UsuarioEntity findByLogin(String login);
}
