package in.nihar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nihar.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}