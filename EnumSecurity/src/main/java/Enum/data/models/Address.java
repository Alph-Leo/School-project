package Enum.data.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document("Address")
public class Address {
    @Id
    private String id;
    private String state;
    private String houseNumber;
    private String street;
    private String town;

}
