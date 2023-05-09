package wijmotopping.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class EmployeeViewQuery {

    String userId;
    String userName;
    DepartmentId department;
}
