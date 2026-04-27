package com.senai.backend.api_dedalo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.api_dedalo.Models.ImoveisModel;
import com.senai.backend.api_dedalo.Services.ImoveisService;

@RestController
@RequestMapping("/ImoveisModel")

public class ImoveisController {
    @Autowired
    private ImoveisService ImoveisService;

    @GetMapping("/contar-imoveis")
    public Long contarImoveis() {
        return ImoveisService.contarImoveis();
    }

    @GetMapping("/buscar-imoveis/(id)")
    public ImoveisModel buscarAluno(@PathVariable Integer id) {
        return ImoveisService.buscarImoveis(id);
    }

    @GetMapping("/listar-imoveis")
    public List<ImoveisModel> listarAlunos() {
        return ImoveisService.listarAluno();
    }

    public String deletarAluno(@PathVariable Integer id) {
        if (ImoveisService.deletarImoveis(id)) {
            return "Imoveis excluídos com sucesso";
        }
        return "Falha na exclusão da aluno";
    }

    @PostMapping("/salvar-aluno")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return ImoveisService.cadastrarAluno(aluno);
    }

    @PutMapping("/atualizar-aluno/(id)")
    public String atualizarAluno(@PathVariable Integer id,
            @RequestBody Aluno aluno) {
        if (ImoveisService.atualizarAluno(id, aluno) != null) {
            return "Aluno atualizado com sucesso";
        }
        return "Falha na atualização do aluno";
    }
}
}
