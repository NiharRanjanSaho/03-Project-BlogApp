package in.nihar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nihar.entity.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
