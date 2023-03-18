package springboot.restful.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.restful.app.entiry.UsersEntiry;

public interface UsersRepository extends JpaRepository<UsersEntiry, Long> {
}
