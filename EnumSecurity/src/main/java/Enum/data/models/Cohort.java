package Enum.data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Getter
@Setter
@Document("Cohort")
public class Cohort {
    @Id
    private String id;
    private String cohortName;
    private String description;
    private List<Program> programs;
    private String startDate;
    private String endDate;
    private String  avatarImageUrl;



//    @PrePersist
//    public void setCreatedAt(){
//        LocalDateTime currentTime = LocalDateTime.now();
//        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        startDate= currentTime.format(formatter);
//
//        LocalDate currentDate = LocalDate.now().plusDays(ONE_YEAR);
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyy");
//        endDate = currentDate.format(format);
//    }


}
