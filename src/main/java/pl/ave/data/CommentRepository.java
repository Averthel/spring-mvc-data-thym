package pl.ave.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ave.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
