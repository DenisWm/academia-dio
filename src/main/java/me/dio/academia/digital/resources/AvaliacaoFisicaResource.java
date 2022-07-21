package me.dio.academia.digital.resources;

import me.dio.academia.digital.domain.AvaliacaoFisica;
import me.dio.academia.digital.dto.AvaliacaoFisicaDTO;
import me.dio.academia.digital.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaResource {

    @Autowired
    AvaliacaoFisicaService service;

    @PostMapping
    public ResponseEntity<AvaliacaoFisica> salvar(@RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDto){
        return ResponseEntity.ok().body(service.save(avaliacaoFisicaDto));
    }

}
