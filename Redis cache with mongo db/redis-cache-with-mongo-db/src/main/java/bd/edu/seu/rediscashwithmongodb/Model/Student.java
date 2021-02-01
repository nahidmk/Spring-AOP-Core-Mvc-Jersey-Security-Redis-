package bd.edu.seu.rediscashwithmongodb.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Student implements Serializable {
    @Id
    private long id;
    private String name;
    private String department;
    private String address;
}
