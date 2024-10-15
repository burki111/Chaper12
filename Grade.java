package Chapter12;

import java.util.Map;

public class Grade {

    public static void main(String[]args){
        Map<String, Integer> gradebook = TestResults.getOriginalGrades();
        Map<String, Integer> book2 = TestResults.getMakeUpGrades();
        for (var results : book2.entrySet()){
            Integer firstgrade = gradebook.get(results.getKey());
            Integer secondgrade = book2.get(results.getKey());

            if(secondgrade > firstgrade){
                gradebook.put(results.getKey(), secondgrade);
            }
        }
        System.out.println("Final Grades:");
        gradebook.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
    }
}
