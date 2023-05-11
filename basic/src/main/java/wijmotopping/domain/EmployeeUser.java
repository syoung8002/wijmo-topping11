package wijmotopping.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
public class EmployeeUser {

    private Long id;

    private String userId;

    private String password;

    private String userName;
}
