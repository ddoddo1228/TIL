package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> stdScores = new HashMap<>();
        stdScores.put("Kim", 95);
        stdScores.put("Lee", 95);
        stdScores.put("Park", 95);
        stdScores.put("Choi", 95);

        System.out.println("Kim's score:" + stdScores.get("Kim"));
        System.out.println("Kim's score:" + stdScores.get("Lee"));

        stdScores.put("Park", 92);
        System.out.println("Park's score:" + stdScores.get("Park"));

        stdScores.remove("Choi");
        System.out.println("Choi score removal:" + stdScores.get("Choi"));

        for(Map.Entry<String, Integer> entry :stdScores.entrySet()){
            System.out.println(entry.getKey()+"'s score:"+entry.getValue());
        }
    }
}
