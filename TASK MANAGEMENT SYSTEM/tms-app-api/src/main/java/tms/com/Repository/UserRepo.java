package tms.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tms.com.Entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	
}
