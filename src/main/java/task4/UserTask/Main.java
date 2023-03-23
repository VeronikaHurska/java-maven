package task4.UserTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("dfd", 43));
        users.add(new User("wr", 22));
        users.add(new User("dfwerwrd", 434));
        users.add(new User("dffsdd", 43));
        users.add(new User("dfdcdfff", 63));
        users.add(new User("fff", 13));
//        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println(users);
    }
}
