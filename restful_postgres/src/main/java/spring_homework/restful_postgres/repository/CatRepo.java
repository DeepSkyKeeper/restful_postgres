package spring_homework.restful_postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_homework.restful_postgres.models.Cat;

@Repository
public interface CatRepo extends JpaRepository<Cat,Integer> {
}
