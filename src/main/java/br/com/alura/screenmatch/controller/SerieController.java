package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.dto.SerieDTO;
import br.com.alura.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private SerieService servicoSerie;

    @GetMapping
    public List<SerieDTO> obtemSeries(){
        return servicoSerie.obterTodasSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtemTop5Series(){
        return servicoSerie.obterTop5Series();
    }

    @GetMapping("/lancamentos")
    public List<SerieDTO> obtemLancamentos(){
        return servicoSerie.obterLancamentos();
    }

    @GetMapping("/{id}")
    public SerieDTO obtemSeriePorId(@PathVariable Long id){
        return servicoSerie.obterPorId(id);
    }
}
