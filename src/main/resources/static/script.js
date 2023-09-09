function obtenerNumeroAleatorio() {

    const numeroDecimalAleatorio = Math.random();

    const numeroAleatorio = Math.floor(numeroDecimalAleatorio * 150) + 1;

    return numeroAleatorio;
}

function obtenerDatosPokemon() {
    // Generar un número aleatorio entre 1 y 151
    const numeroAleatorio = Math.floor(Math.random() * 150) + 1;
    const url = `https://pokeapi.co/api/v2/pokemon/${numeroAleatorio}`;

    // Realizar la solicitud a la Poke API
    fetch(url)
        .then(response => response.json())
        .then(data => {
            // Extraer los datos que necesitas del objeto de respuesta
            const nombre = data.name;
            const peso = data.weight;
            const altura = data.height;
            const tipos = data.types.map(type => type.type.name);
            const ataques = data.moves.map(move => move.move.name);
            const especie = data.form_name;
            const imagenUrl = data.sprites.front_default;

            // Crear un elemento HTML para mostrar la imagen
            const imagenElement = document.createElement("img");
            imagenElement.src = imagenUrl;

            // Crear un elemento HTML para mostrar los datos
            const pokemonInfoElement = document.getElementById("pokemon-info");
            pokemonInfoElement.innerHTML = `
        <h2>${nombre}</h2>
        <p>Peso: ${peso} kg</p>
        <p>Altura: ${altura} cm</p>
        <p>Tipo: ${tipos.join(", ")}</p>
        <p>Especie: ${especie}</p>
        <p>Ataques: ${ataques.join(", ")}</p>      
      `;

            // Agregar la imagen al elemento
            pokemonInfoElement.appendChild(imagenElement);
        })
        .catch(error => console.error("Error al obtener los datos del Pokémon:", error));
}
