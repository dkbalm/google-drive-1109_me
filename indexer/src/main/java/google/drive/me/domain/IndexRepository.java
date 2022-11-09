package google.drive.me.domain;

import google.drive.me.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="indices", path="indices")
public interface IndexRepository extends PagingAndSortingRepository<Index, Long>{

}
