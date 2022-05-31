package com.letscode.santander.harrypotter.cadastroalunos.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SortingHatDto {

    @JsonProperty("sorting-hat-choice")
    private String sortingHatChoice;

}
