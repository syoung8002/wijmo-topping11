package wijmotopping.domain;

import java.util.*;
import lombok.*;
import wijmotopping.domain.*;
import wijmotopping.infra.AbstractEvent;

@Data
@ToString
public class EmployeeAdded extends AbstractEvent {

    private Long id;
    private String userId;
    private String userName;
    private RankId rankId;
    private DepartmentId departmentId;

    public EmployeeAdded(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdded() {
        super();
    }
}
