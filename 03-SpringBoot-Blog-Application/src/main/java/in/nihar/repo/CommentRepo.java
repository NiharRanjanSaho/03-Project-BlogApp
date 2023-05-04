package in.nihar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nihar.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}