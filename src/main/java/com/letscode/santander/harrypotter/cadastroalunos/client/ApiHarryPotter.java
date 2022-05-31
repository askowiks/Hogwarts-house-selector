package com.letscode.santander.harrypotter.cadastroalunos.client;

import com.letscode.santander.harrypotter.cadastroalunos.client.dto.HouseDto;
import com.letscode.santander.harrypotter.cadastroalunos.client.dto.SortingHatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "api-harry-potter", url = "https://api-harrypotter.herokuapp.com")
public interface ApiHarryPotter {

    @GetMapping("/sortinghat")
    SortingHatDto sortearIdCasa();

    @GetMapping("/house/{id}")
    HouseDto procurar(@PathVariable("id") String id);

}
