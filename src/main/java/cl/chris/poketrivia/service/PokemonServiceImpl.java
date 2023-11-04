package cl.chris.poketrivia.service;

import cl.chris.poketrivia.dto.PokemonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements IPokemonService{

    private final RestTemplate restTemplate;


    @Value("${pokeapibase.url}")
    private String pokeApiBaseUrl;
    public PokemonDTO obtenerPokemon(){
        Random random = new Random();
        int idPokemonAzar = random.nextInt(151) + 1;
        PokemonDTO response = restTemplate.getForObject(pokeApiBaseUrl+idPokemonAzar, PokemonDTO.class);
        return response;
    }
}
