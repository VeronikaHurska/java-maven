package task4.PersonTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills;

    @Override
    public int compareTo(Person o) {
        return this.getSkills().size() - o.getSkills().size();
    }
//    private Car car;

}
