package kz.iitu.csse.group34.repositories;
import kz.iitu.csse.group34.entities.Books;
import kz.iitu.csse.group34.entities.Items;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BooksRepository extends JpaRepository<Books, Long> {

    List<Books> findAllByDeletedAtNull(Pageable pageable);
    Optional<Books> findByIdAndDeletedAtNull(Long id);
    int countAllByDeletedAtNull();

}

