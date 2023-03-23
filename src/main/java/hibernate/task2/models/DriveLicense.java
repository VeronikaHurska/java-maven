package hibernate.task2.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@ToString
public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String series;

    public DriveLicense(String series) {
        this.series = series;
    }
}
