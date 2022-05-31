package com.letscode.santander.harrypotter.cadastroalunos.service;

import com.letscode.santander.harrypotter.cadastroalunos.client.ApiHarryPotter;
import com.letscode.santander.harrypotter.cadastroalunos.client.dto.HouseDto;
import com.letscode.santander.harrypotter.cadastroalunos.dto.AlunoDto;
import com.letscode.santander.harrypotter.cadastroalunos.model.Aluno;
import com.letscode.santander.harrypotter.cadastroalunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    ApiHarryPotter apiHarryPotter;

    public Aluno cadastrar(Aluno novoAluno) {
        String idCasa = apiHarryPotter.sortearIdCasa().getSortingHatChoice();
        System.out.println("\n\nGerando idCasa...\nvalor: " + idCasa + "\n\n");
        novoAluno.setIdCasa(idCasa);
        return alunoRepository.save(novoAluno);
    }

    public AlunoDto procurar(Integer id) {
        Aluno alunoProcurado = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Erro ao procurar aluno de id: " + id));

        HouseDto casa = apiHarryPotter.procurar(alunoProcurado.getIdCasa());

        AlunoDto alunoDto = new AlunoDto();
        alunoDto.setId(alunoProcurado.getId());
        alunoDto.setNome(alunoProcurado.getNome());
        alunoDto.setSerie(alunoProcurado.getSerie());
        alunoDto.setCasa(casa);


        return alunoDto;
    }

}
