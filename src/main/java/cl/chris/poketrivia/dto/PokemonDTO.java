package cl.chris.poketrivia.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDTO {

    private String name;
    private int weight;
    private int height;
    private PokemonSpriteDTO sprites;
}
