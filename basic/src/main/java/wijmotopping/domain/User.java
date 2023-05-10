package wijmotopping.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;

    private String password;

    private String userName;

    private String email;

    private String address;

    private String phone;
}
