package br.com.mastertech.evento.controller;

import br.com.mastertech.evento.model.EventoModel;
import br.com.mastertech.evento.services.EventoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {

    @Autowired
    private EventoServices service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @GetMapping("/form")
    public String mostrarFormulario(){
        return "form";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEvento(EventoModel evento){
        service.cadastrarEvento(evento);
        return "form";
    }
}
