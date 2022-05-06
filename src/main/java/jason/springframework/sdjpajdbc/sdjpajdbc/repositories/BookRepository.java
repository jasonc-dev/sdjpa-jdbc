package jason.springframework.sdjpajdbc.sdjpajdbc.repositories;

import jason.springframework.sdjpajdbc.sdjpajdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
