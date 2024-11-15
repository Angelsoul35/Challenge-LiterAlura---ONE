package com.angelo.literalura.Mappers;

import com.angelo.literalura.Entities.AutorDTO;
import com.angelo.literalura.Entities.BookDTO;
import com.angelo.literalura.Entities.Models.Author;
import com.angelo.literalura.Entities.Models.Books;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T16:02:30-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Books DTOtoEntity(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Books books = new Books();

        books.setAutores( autorDTOListToAuthorSet( bookDTO.autor() ) );
        books.setTitulo( bookDTO.titulo() );
        books.setEjemplaresDescargados( bookDTO.ejemplaresDescargados() );

        books.setIdiomas( new java.util.HashSet<>(bookDTO.idiomas()) );

        return books;
    }

    @Override
    public BookDTO EntityToDTO(Books books) {
        if ( books == null ) {
            return null;
        }

        List<AutorDTO> autor = null;
        String titulo = null;
        Integer ejemplaresDescargados = null;

        autor = authorSetToAutorDTOList( books.getAutores() );
        titulo = books.getTitulo();
        ejemplaresDescargados = books.getEjemplaresDescargados();

        List<String> idiomas = new java.util.ArrayList<>(books.getIdiomas());

        BookDTO bookDTO = new BookDTO( titulo, autor, idiomas, ejemplaresDescargados );

        return bookDTO;
    }

    protected Author autorDTOToAuthor(AutorDTO autorDTO) {
        if ( autorDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setNombreAutor( autorDTO.nombreAutor() );
        author.setFechaNacimiento( autorDTO.fechaNacimiento() );
        author.setFechaFallecimiento( autorDTO.fechaFallecimiento() );

        return author;
    }

    protected Set<Author> autorDTOListToAuthorSet(List<AutorDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<Author> set = new LinkedHashSet<Author>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( AutorDTO autorDTO : list ) {
            set.add( autorDTOToAuthor( autorDTO ) );
        }

        return set;
    }

    protected AutorDTO authorToAutorDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        String nombreAutor = null;
        Integer fechaNacimiento = null;
        Integer fechaFallecimiento = null;

        nombreAutor = author.getNombreAutor();
        fechaNacimiento = author.getFechaNacimiento();
        fechaFallecimiento = author.getFechaFallecimiento();

        AutorDTO autorDTO = new AutorDTO( nombreAutor, fechaNacimiento, fechaFallecimiento );

        return autorDTO;
    }

    protected List<AutorDTO> authorSetToAutorDTOList(Set<Author> set) {
        if ( set == null ) {
            return null;
        }

        List<AutorDTO> list = new ArrayList<AutorDTO>( set.size() );
        for ( Author author : set ) {
            list.add( authorToAutorDTO( author ) );
        }

        return list;
    }
}
