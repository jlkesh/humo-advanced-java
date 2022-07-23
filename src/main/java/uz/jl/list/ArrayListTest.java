package uz.jl.list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.SourceVersion;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
//        List<String> langsOne = new ArrayList<>();
//        langsOne.add("Java");
//        langsOne.add(0, "C#");
//        langsOne.add("Cpp");
//        langsOne.add("Kotlin");
//        langsOne.add("Scala");
//
//        ArrayList<String> langsTwo = new ArrayList<>();
//        langsTwo.add("Ruby");
//        langsTwo.add("Erlang");
//        langsTwo.add("Go");
//        langsTwo.add("Swift");
//        langsTwo.add("Pascal");
//        System.out.println(langsOne);
//        langsOne.addAll(0, langsTwo);
//        System.out.println("langsOne = " + langsOne);

//        langsOne.clear();
//        System.out.println("langsOne = " + langsOne);
//        Iterator<String> iterator = langsOne.iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            if (next.equals("Pascal"))
//                iterator.remove();
//            System.out.println(next);
//        }
//
//        System.out.println("langsOne = " + langsOne);
//        langsOne.sort(Comparator.naturalOrder());
//        langsOne.sort(Comparator.reverseOrder());
//        langsOne.sort(Comparator.comparing(s->s.getAge()));
//        System.out.println("langsOne = " + langsOne);
        User user1 = new User((short) 27, "Javohir Elmurodov");
        User user2 = new User((short) 27, "Dilshod Mashka");
        User user4 = new User((short) 30, "Sardor aka Tohtaboyev");
        User user3 = new User((short) 28, "Shahzod aka Muhammadov");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
//        users.sort(Comparator.comparing(User::getAge)
//                        .thenComparing(User::getFullName)
//                        .thenComparing(User::getFullName)
//                        .thenComparing(User::getFullName)
//                        .thenComparing(User::getFullName)
//                        .thenComparing(User::getFullName)
//                        .thenComparing(User::getFullName)
//        );

//        System.out.println("users = " + users);
//        User[] usersArray = users.toArray(User[]::new);
//        Arrays.sort(usersArray);
//        System.out.println(Arrays.toString(usersArray));


    }
}
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//class User implements Comparable<User> {
//    private short age;
//    private String fullName;
//
//
//    @Override
//    public int compareTo(User o) {
//        int compare = Short.compare(this.getAge(), o.getAge());
//        if (compare == 0)
//            compare = this.getFullName().compareTo(o.getFullName());
//        return -1 * compare;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "age=" + age +
//                ", fullName='" + fullName + '\'' +
//                '}';
//    }
//}


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User implements Comparator<User> {
    private short age;
    private String fullName;

    @Override
    public int compare(User o1, User o2) {
        int compare = Short.compare(o1.getAge(), o2.getAge());
        if (compare == 0)
            compare = o1.getFullName().compareTo(o2.getFullName());
        return compare;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}