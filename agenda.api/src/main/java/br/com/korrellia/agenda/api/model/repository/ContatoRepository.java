package br.com.korrellia.agenda.api.model.repository;

import br.com.korrellia.agenda.api.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
