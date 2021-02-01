package bd.edu.seu.springsecurity.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class user_pass {
    @Id
    private long id;
    private String userName;
    private String password;
}
