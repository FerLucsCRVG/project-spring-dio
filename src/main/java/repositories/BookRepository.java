package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.diospring.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
