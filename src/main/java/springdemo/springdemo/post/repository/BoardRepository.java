package springdemo.springdemo.post.repository;

import springdemo.springdemo.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
