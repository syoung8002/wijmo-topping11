package wijmotopping.domain;

import java.util.*;
import lombok.*;
import wijmotopping.domain.*;
import wijmotopping.infra.AbstractEvent;

@Data
@ToString
public class DepartmentAdded extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdded(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdded() {
        super();
    }
}
