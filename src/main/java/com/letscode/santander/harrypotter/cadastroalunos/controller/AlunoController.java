package com.letscode.santander.harrypotter.cadastroalunos.controller;

import com.letscode.santander.harrypotter.cadastroalunos.dto.AlunoDto;
import com.letscode.santander.harrypotter.cadastroalunos.model.Aluno;
import com.letscode.santander.harrypotter.cadastroalunos.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public Aluno cadastrar(@RequestBody Aluno novoAluno) {
        return alunoService.cadastrar(novoAluno);
    }

    @GetMapping("/{id}")
    public AlunoDto procurar(@PathVariable("id") Integer id){
        return alunoService.procurar(id);
    }

}
