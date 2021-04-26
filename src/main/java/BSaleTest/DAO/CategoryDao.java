package BSaleTest.DAO;

import BSaleTest.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDao extends JpaRepository<Category,Integer> {
}
