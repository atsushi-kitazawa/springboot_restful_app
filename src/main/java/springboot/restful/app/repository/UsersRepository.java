package springboot.restful.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.restful.app.entiry.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
}
