package cl.chris.poketrivia.controller;

import cl.chris.poketrivia.dto.PokemonDTO;
import cl.chris.poketrivia.service.IPokemonService;
import cl.chris.poketrivia.service.RandomPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PokemonController {

    @Autowired
    IPokemonService objPokemonService;

    @Autowired
    RandomPokemonService objRandomPokemonService;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo", "¿Quién es ese Pokémon?");
        return "index";
    }

    @PostMapping("/redirectJugar")
    public String jugar(){
        return "redirect:/jugar";
    }

    @GetMapping("/jugar")
    public String obtenerPokemon(Model model){
        PokemonDTO pokemon = new PokemonDTO();
        pokemon = objPokemonService.obtenerPokemon();
        model.addAttribute("pokemon",pokemon);
        model.addAttribute("titulo", "¿Quién es ese Pokémon? v 0.0.1");
        List<String> pokemonsRandom = objRandomPokemonService.opcionesPokemon(pokemon);
        model.addAttribute("pokemonsRandom", pokemonsRandom);
        return "jugar";
    }


}
