package task4.PersonTask;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        HashSet<Person> arr = new HashSet<>();

        Set<Person> arr = new TreeSet<>();
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 1));
        skills.add(new Skill("js", 4));

        ArrayList<Skill> skills2 = new ArrayList<>();
        skills2.add(new Skill("jddsfs", 44));
        skills2.add(new Skill("jddsfs", 44));
        skills2.add(new Skill("jddsfs", 44));
        skills2.add(new Skill("jddsfs", 44));


        ArrayList<Skill> skills3 = new ArrayList<>();
        skills.add(new Skill("java", 1));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));
        skills.add(new Skill("js", 4));





        arr.add(new Person(4, "4", "4", "4", 21, Gender.MALE, skills));
        arr.add(new Person(2, "2", "2", "2", 21, Gender.FEMALE, skills2));
        arr.add(new Person(3, "3", "3", "3", 21, Gender.MALE, skills3));



        System.out.println(arr);
    }

}
