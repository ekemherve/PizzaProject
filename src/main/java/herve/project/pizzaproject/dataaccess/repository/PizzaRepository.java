package herve.project.pizzaproject.dataaccess.repository;

import herve.project.pizzaproject.dataaccess.entity.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {
}
