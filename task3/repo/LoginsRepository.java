package task3.repo;

import org.springframework.data.repository.CrudRepository;
import task3.models.Logins;

public interface LoginsRepository extends CrudRepository<Logins, Long> {

}
