package Tutorials;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample{
    public static void main(String[] args) {
        // Create a ArrayList
        List<String> list=new ArrayList<String>();
        // Add values to the list
<<<<<<< HEAD
        list.add("Ricke");
=======
        list.add("Rick");
>>>>>>> 4f000f9d0dd7391f20c1678f7e1d3b79f2e9af5e
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        
        // Loop through ArrayList
        list.forEach( 
            // lambda expression 
            (names)->System.out.println(names)
        );
    }
}