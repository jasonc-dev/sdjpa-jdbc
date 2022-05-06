package jason.springframework.sdjpajdbc.dao;

import jason.springframework.sdjpajdbc.domain.Book;

public interface BookDao {

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book saved);

    void deleteBookById(Long id);
}
