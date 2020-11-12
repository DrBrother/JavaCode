package task3.repo;

import org.springframework.data.repository.CrudRepository;
import task3.models.Logins;
import task3.models.Posting;

public interface PostingRepository extends CrudRepository<Posting, Long> {

}
