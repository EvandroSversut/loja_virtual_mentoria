package jdev.mentoria.lojavirtual.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jdev.mentoria.lojavirtual.model.Usuario;

/*extend - pode ser o JpaRepository ou CRUDrepository*/
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	/*essa é a query do spring data*/
	@Query(value = "select u from Usuario u where u.login = ?1")
	Usuario findUserByLogin(String login);
	
	
}
