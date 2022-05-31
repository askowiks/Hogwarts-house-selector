package com.letscode.santander.harrypotter.cadastroalunos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.letscode.santander.harrypotter.cadastroalunos.client.dto.HouseDto;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlunoDto {

    private Integer id;
    private String nome;
    private Integer serie;
    private HouseDto casa;

}
