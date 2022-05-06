package jason.springframework.sdjpajdbc.dao;

import jason.springframework.sdjpajdbc.domain.Author;

public interface AuthorDao {

    Author getById(Long id);
}
