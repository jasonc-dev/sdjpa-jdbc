package jason.springframework.sdjpajdbc.dao;

import jason.springframework.sdjpajdbc.domain.Author;

public interface AuthorDao {

    Author getById(Long id);

    Author findAuthorByName(String firstName, String lastName);

    Author saveNewAuthor(Author author);

    Author updateAuthor(Author author);
}
