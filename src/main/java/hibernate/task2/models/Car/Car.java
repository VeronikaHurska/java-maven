package hibernate.task2.models.Car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String model;
    private Type type;
    private int power;
    private int price;
    private int year;

    public Car(String model, Type type, int power, int price, int year) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
        this.year = year;
    }
}
