package ma.emsi.springgraphql.DTO;

import ma.emsi.springgraphql.enums.Genre;

public record EtudiantDTO(
        String nom,
        String prenom,
        Genre genre,
        Long centreId
) {
}
