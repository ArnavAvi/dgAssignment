package restful.api.datagrokr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restful.api.datagrokr.Model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, String> {

}
