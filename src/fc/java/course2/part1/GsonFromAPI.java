package fc.java.course2.part1;
import fc.java.model2.Person;
import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";

        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());
    }
}
