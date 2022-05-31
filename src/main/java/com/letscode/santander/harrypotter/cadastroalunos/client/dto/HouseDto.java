package com.letscode.santander.harrypotter.cadastroalunos.client.dto;

import lombok.Data;

import java.util.List;

@Data
public class HouseDto {

    private String id;
    private String name;
    private String animal;
    private String founder;
    private List<HouseValuesDto> values;

}
