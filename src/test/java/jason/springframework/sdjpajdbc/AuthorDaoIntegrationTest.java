package jason.springframework.sdjpajdbc;

import jason.springframework.sdjpajdbc.dao.AuthorDao;
import jason.springframework.sdjpajdbc.domain.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = {"jason.springframework.sdjpajdbc.dao"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthorDaoIntegrationTest {

    @Autowired
    AuthorDao authorDao;

    @Test
    void testDeleteAuthor() {
        Author author = new Author();
        author.setFirstName("Jay");
        author.setLastName("C");

        Author saved = authorDao.saveNewAuthor(author);

        authorDao.deleteAuthorById(saved.getId());

        Author deleted = authorDao.getById(saved.getId());

        assertThat(deleted).isNull();
    }

    @Test
    void testUpdateAuthor() {
        Author author = new Author();
        author.setFirstName("Jay");
        author.setLastName("Cohen");

        Author saved = authorDao.saveNewAuthor(author);

        saved.setLastName("Lowther");
        Author updated = authorDao.updateAuthor(saved);

        assertThat(updated.getLastName()).isEqualTo("Lowther");
    }

    @Test
    void testSaveAuthor() {
        Author author = new Author();
        author.setFirstName("Jay");
        author.setLastName("Cohen");
        Author saved = authorDao.saveNewAuthor(author);

        assertThat(saved).isNotNull();
    }

    @Test
    void testGetAuthorByName() {

        Author author = authorDao.findAuthorByName("Craig", "Walls");

        assertThat(author).isNotNull();
    }

    @Test
    void testGetAuthor() {

        Author author = authorDao.getById(1L);

        assertThat(author).isNotNull();
    }
}
