package br.com.mastertech.evento.services;

import br.com.mastertech.evento.model.EventoModel;
import br.com.mastertech.evento.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoServices {

    @Autowired
    private EventoRepository repository;

    public EventoModel cadastrarEvento(EventoModel evento) {
        return repository.save(evento);
    }

}
