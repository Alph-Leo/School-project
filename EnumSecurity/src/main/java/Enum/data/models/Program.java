package Enum.data.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("Program")
public class Program {
    @Id
    private String id;
    private String programName;
}
