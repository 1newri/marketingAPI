package kr.co.marketingAPI.sample.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.marketingAPI.sample.User;

public interface UserJpaRepo extends JpaRepository<User, Long>{
	Optional<User> findByUid(String email);
}
