package wijmotopping.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wijmotopping.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "employeeusers",
    path = "employeeusers"
)
public interface EmployeeUserRepository
    extends PagingAndSortingRepository<EmployeeUser, Long> {}
