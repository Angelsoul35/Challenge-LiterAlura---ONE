package com.angelo.literalura.Mappers;

import com.angelo.literalura.Entities.AutorDTO;
import com.angelo.literalura.Entities.Models.Author;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T16:02:32-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class AutorMapperImpl implements AutorMapper {

    @Override
    public Author DTOtoEntity(AutorDTO autorDTO) {
        if ( autorDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setFechaFallecimiento( autorDTO.fechaFallecimiento() );
        author.setNombreAutor( autorDTO.nombreAutor() );
        author.setFechaNacimiento( autorDTO.fechaNacimiento() );

        return author;
    }

    @Override
    public AutorDTO EntityToDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        Integer fechaFallecimiento = null;
        String nombreAutor = null;
        Integer fechaNacimiento = null;

        fechaFallecimiento = author.getFechaFallecimiento();
        nombreAutor = author.getNombreAutor();
        fechaNacimiento = author.getFechaNacimiento();

        AutorDTO autorDTO = new AutorDTO( nombreAutor, fechaNacimiento, fechaFallecimiento );

        return autorDTO;
    }
}
