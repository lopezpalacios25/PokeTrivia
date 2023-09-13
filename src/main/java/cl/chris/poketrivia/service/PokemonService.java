package cl.chris.poketrivia.service;

import cl.chris.poketrivia.dto.PokemonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final RestTemplate restTemplate;
    Random random = new Random();
    int idPokemonAzar = random.nextInt(151) + 1;

    @Value("${pokeapibase.url}")
    private String pokeApiBaseUrl;
    public PokemonDTO getPokemon(){

        PokemonDTO response = restTemplate.getForObject(pokeApiBaseUrl+"25", PokemonDTO.class);
        return response;
    }
}
