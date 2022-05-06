package jason.springframework.sdjpajdbc.repositories;

import jason.springframework.sdjpajdbc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
