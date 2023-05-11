package wijmotopping.domain;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Data

public class EmployeeUser  {

    
    
    
    private String userId;
    
    
    
    private String password;
    
    
    
    private String userName;
    
    
    
    private String email;
    
    
    
    private String address;
    
    
    
    private String phone;
    
    
    
    private Long long;

}
