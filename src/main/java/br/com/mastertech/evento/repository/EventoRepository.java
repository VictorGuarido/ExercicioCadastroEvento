package br.com.mastertech.evento.repository;

import br.com.mastertech.evento.model.EventoModel;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<EventoModel, String> {

}
