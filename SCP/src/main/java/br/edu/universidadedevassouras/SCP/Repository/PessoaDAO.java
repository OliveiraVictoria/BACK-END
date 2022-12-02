package br.edu.universidadedevassouras.SCP.Repository;

import br.edu.universidadedevassouras.SCP.Model.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface PessoaDAO extends CrudRepository<Pessoa, Long> {
}
