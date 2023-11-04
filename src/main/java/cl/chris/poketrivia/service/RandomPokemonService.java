package cl.chris.poketrivia.service;

import cl.chris.poketrivia.dto.PokemonDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RandomPokemonService {

    public List<String> opcionesPokemon(PokemonDTO pokemonEscogido){

        HashMap<Integer, String> pokemon1st = new HashMap<>();

        pokemon1st.put(1, "Bulbasaur");
        pokemon1st.put(2, "Ivysaur");
        pokemon1st.put(3, "Venusaur");
        pokemon1st.put(4, "Charmander");
        pokemon1st.put(5, "Charmeleon");
        pokemon1st.put(6, "Charizard");
        pokemon1st.put(7, "Squirtle");
        pokemon1st.put(8, "Wartortle");
        pokemon1st.put(9, "Blastoise");
        pokemon1st.put(10, "Caterpie");
        pokemon1st.put(11, "Metapod");
        pokemon1st.put(12, "Butterfree");
        pokemon1st.put(13, "Weedle");
        pokemon1st.put(14, "Kakuna");
        pokemon1st.put(15, "Beedrill");
        pokemon1st.put(16, "Pidgey");
        pokemon1st.put(17, "Pidgeotto");
        pokemon1st.put(18, "Pidgeot");
        pokemon1st.put(19, "Rattata");
        pokemon1st.put(20, "Raticate");
        pokemon1st.put(21, "Spearow");
        pokemon1st.put(22, "Fearow");
        pokemon1st.put(23, "Ekans");
        pokemon1st.put(24, "Arbok");
        pokemon1st.put(25, "Pikachu");
        pokemon1st.put(26, "Raichu");
        pokemon1st.put(27, "Sandshrew");
        pokemon1st.put(28, "Sandslash");
        pokemon1st.put(29, "Nidoran♀");
        pokemon1st.put(30, "Nidorina");
        pokemon1st.put(31, "Nidoqueen");
        pokemon1st.put(32, "Nidoran♂");
        pokemon1st.put(33, "Nidorino");
        pokemon1st.put(34, "Nidoking");
        pokemon1st.put(35, "Clefairy");
        pokemon1st.put(36, "Clefable");
        pokemon1st.put(37, "Vulpix");
        pokemon1st.put(38, "Ninetales");
        pokemon1st.put(39, "Jigglypuff");
        pokemon1st.put(40, "Wigglytuff");
        pokemon1st.put(41, "Zubat");
        pokemon1st.put(42, "Golbat");
        pokemon1st.put(43, "Oddish");
        pokemon1st.put(44, "Gloom");
        pokemon1st.put(45, "Vileplume");
        pokemon1st.put(46, "Paras");
        pokemon1st.put(47, "Parasect");
        pokemon1st.put(48, "Venonat");
        pokemon1st.put(49, "Venomoth");
        pokemon1st.put(50, "Digglet");
        pokemon1st.put(51, "Dugtrio");
        pokemon1st.put(52, "Meowth");
        pokemon1st.put(53, "Persian");
        pokemon1st.put(54, "Psyduck");
        pokemon1st.put(55, "Golduck");
        pokemon1st.put(56, "Mankey");
        pokemon1st.put(57, "Primeape");
        pokemon1st.put(58, "Growlithe");
        pokemon1st.put(59, "Arcanine");
        pokemon1st.put(60, "Poliwag");
        pokemon1st.put(61, "Poliwhirl");
        pokemon1st.put(62, "Poliwrath");
        pokemon1st.put(63, "Abra");
        pokemon1st.put(64, "Kadabra");
        pokemon1st.put(65, "Alakazam");
        pokemon1st.put(66, "Machop");
        pokemon1st.put(67, "Machoke");
        pokemon1st.put(68, "Machamp");
        pokemon1st.put(69, "Bellsprout");
        pokemon1st.put(70, "Weepinbell");
        pokemon1st.put(71, "Victreebel");
        pokemon1st.put(72, "Tentacool");
        pokemon1st.put(73, "Tentacruel");
        pokemon1st.put(74, "Geodude");
        pokemon1st.put(75, "Graveler");
        pokemon1st.put(76, "Golem");
        pokemon1st.put(77, "Ponyta");
        pokemon1st.put(78, "Rapidash");
        pokemon1st.put(79, "Slowpoke");
        pokemon1st.put(80, "Slowbro");
        pokemon1st.put(81, "Magnemite");
        pokemon1st.put(82, "Magneton");
        pokemon1st.put(83, "Farfetch'd");
        pokemon1st.put(84, "Doduo");
        pokemon1st.put(85, "Dodrio");
        pokemon1st.put(86, "Seel");
        pokemon1st.put(87, "Dewgong");
        pokemon1st.put(88, "Grimer");
        pokemon1st.put(89, "Muk");
        pokemon1st.put(90, "Shellder");
        pokemon1st.put(91, "Cloyster");
        pokemon1st.put(92, "Gastly");
        pokemon1st.put(93, "Haunter");
        pokemon1st.put(94, "Gengar");
        pokemon1st.put(95, "Onix");
        pokemon1st.put(96, "Drowzee");
        pokemon1st.put(97, "Hypno");
        pokemon1st.put(98, "Krabby");
        pokemon1st.put(99, "Kingler");
        pokemon1st.put(100, "Voltorb");
        pokemon1st.put(101, "Electrode");
        pokemon1st.put(102, "Exeggcute");
        pokemon1st.put(103, "Exeggutor");
        pokemon1st.put(104, "Cubone");
        pokemon1st.put(105, "Marowak");
        pokemon1st.put(106, "Hitmonlee");
        pokemon1st.put(107, "Hitmonchan");
        pokemon1st.put(108, "Lickitung");
        pokemon1st.put(109, "Koffing");
        pokemon1st.put(110, "Weezing");
        pokemon1st.put(111, "Rhyhorn");
        pokemon1st.put(112, "Rhydon");
        pokemon1st.put(113, "Chansey");
        pokemon1st.put(114, "Tangela");
        pokemon1st.put(115, "Kangaskhan");
        pokemon1st.put(116, "Horsea");
        pokemon1st.put(117, "Seadra");
        pokemon1st.put(118, "Goldeen");
        pokemon1st.put(119, "Seaking");
        pokemon1st.put(120, "Staryu");
        pokemon1st.put(121, "Starmie");
        pokemon1st.put(122, "Mr. Mime");
        pokemon1st.put(123, "Scyther");
        pokemon1st.put(124, "Jynx");
        pokemon1st.put(125, "Electabuzz");
        pokemon1st.put(126, "Magmar");
        pokemon1st.put(127, "Pinsir");
        pokemon1st.put(128, "Tauros");
        pokemon1st.put(129, "Magikarp");
        pokemon1st.put(130, "Gyarados");
        pokemon1st.put(131, "Lapras");
        pokemon1st.put(132, "Ditto");
        pokemon1st.put(133, "Eevee");
        pokemon1st.put(134, "Vaporeon");
        pokemon1st.put(135, "Jolteon");
        pokemon1st.put(136, "Flareon");
        pokemon1st.put(137, "Porygon");
        pokemon1st.put(138, "Omanyte");
        pokemon1st.put(139, "Omastar");
        pokemon1st.put(140, "Kabuto");
        pokemon1st.put(141, "Kabutops");
        pokemon1st.put(142, "Aerodactyl");
        pokemon1st.put(143, "Snorlax");
        pokemon1st.put(144, "Articuno");
        pokemon1st.put(145, "Zapdos");
        pokemon1st.put(146, "Moltres");
        pokemon1st.put(147, "Dratini");
        pokemon1st.put(148, "Dragonair");
        pokemon1st.put(149, "Dragonite");
        pokemon1st.put(150, "Mewtwo");
        pokemon1st.put(151, "Mew");

        Random random = new Random();
        int idPokemonAzar;

        String pokemon1;
        do{
            idPokemonAzar = random.nextInt(151) + 1;
            pokemon1 = pokemon1st.get(idPokemonAzar);
        }while(pokemonEscogido.getName().equals(pokemon1));

        String pokemon2;
        do{
            idPokemonAzar = random.nextInt(151) + 1;
            pokemon2 = pokemon1st.get(idPokemonAzar);
        }while(pokemonEscogido.getName().equals(pokemon2));

        String pokemon3;
        do{
            idPokemonAzar = random.nextInt(151) + 1;
            pokemon3 = pokemon1st.get(idPokemonAzar);
        }while(pokemonEscogido.getName().equals(pokemon3));

        String pokemon4;
        do{
            idPokemonAzar = random.nextInt(151) + 1;
            pokemon4 = pokemon1st.get(idPokemonAzar);
        }while(pokemonEscogido.getName().equals(pokemon4));

        List<String> opciones = Arrays.asList(pokemon1,pokemon2,pokemon3,pokemon4);
        return opciones;

    }
}
