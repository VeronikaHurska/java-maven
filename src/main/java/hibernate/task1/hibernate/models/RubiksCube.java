package hibernate.task1.hibernate.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "all_cubes")

@NoArgsConstructor
@ToString
public class RubiksCube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cube_brand")
    @Getter
    @Setter
    private String brand;
    @Getter
    @Setter
    private int size;

    public RubiksCube(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
}
