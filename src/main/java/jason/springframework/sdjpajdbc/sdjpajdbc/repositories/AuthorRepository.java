package jason.springframework.sdjpajdbc.sdjpajdbc.repositories;

import jason.springframework.sdjpajdbc.sdjpajdbc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
