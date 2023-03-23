package hibernate.task2.models;

import hibernate.task2.models.Car.Car;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "owner_cars",
            joinColumns = @JoinColumn(name = "owner_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private List<Car> cars;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_license_id",referencedColumnName = "id")
    private DriveLicense driveLicense;

    public Owner(String name, List<Car> cars, DriveLicense driveLicense) {
        this.name = name;
        this.cars = cars;
        this.driveLicense = driveLicense;
    }
}
