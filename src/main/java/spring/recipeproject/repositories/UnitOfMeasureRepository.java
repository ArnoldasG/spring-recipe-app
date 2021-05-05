package spring.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
