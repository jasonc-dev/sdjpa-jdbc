package jason.springframework.sdjpajdbc.repositories;

import jason.springframework.sdjpajdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
