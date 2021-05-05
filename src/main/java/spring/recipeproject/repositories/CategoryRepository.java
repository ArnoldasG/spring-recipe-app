package spring.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
