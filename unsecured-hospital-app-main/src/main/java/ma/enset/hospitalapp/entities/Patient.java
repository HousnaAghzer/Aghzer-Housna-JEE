package ma.enset.hospitalapp.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity     //Annotation Jpa
@Data @NoArgsConstructor @AllArgsConstructor @Builder  //Annotation Lombok
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)  //Annotation Jpa
    private Long id;
    @NotEmpty @Size(min = 4, max = 20)  //Annotation de validation
    private String nom;
    @Temporal(TemporalType.DATE)  //Annotation Jpa
    @DateTimeFormat(pattern = "yyyy-MM-dd") //Annotation pour le format de la date
    private Date dateNaissance;
    private boolean malade;
    @Min(10)  //Annotation de validation
    private int score;
}
