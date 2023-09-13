package cl.chris.poketrivia.restcontroller;

import cl.chris.poketrivia.dto.PokemonDTO;
import cl.chris.poketrivia.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonRestController {

    @Autowired
    private PokemonService objPokemonService;

    @GetMapping
    public ResponseEntity<PokemonDTO> getPokemon(){

        return new ResponseEntity<>(objPokemonService.getPokemon() , HttpStatus.OK);
    }

}
