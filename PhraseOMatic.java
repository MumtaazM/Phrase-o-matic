import java.util.*;
import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {

        //creating three ArrayLists of String type
        ArrayList<String> list1 = new ArrayList<String>(
            Arrays.asList("formidable","success","Geeks","accomplished", " centric"));

        ArrayList<String> list2 = new ArrayList<String>(
            Arrays.asList("oriented","branded","portal", "web-based", " shared"));
                  
        ArrayList<String> list3 = new ArrayList<String>(
            Arrays.asList("architecture", "vision", "targeted", "aligned", " paradigm"));
                                
        //Finding the size of the lists
        int ListSize1 = list1.size();
        int ListSize2 = list2.size();
        int ListSize3 = list3.size();

        //generate random index numbers for each list and store it in a variable
        Random rand = new Random();
    
        int randIndex1 = rand.nextInt(ListSize1);
        int randIndex2 = rand.nextInt(ListSize2);
        int randIndex3 = rand.nextInt(ListSize3);

        String randWord1 = list1.get(randIndex1);
        String randWord2 = list2.get(randIndex2);
        String randWord3 = list3.get(randIndex3);

        //now build a phrase
        String phrase = randWord1 + ", " + randWord2 + ", " + randWord3 + " ";

        //print the phrase out
        System.out.println(phrase);




    

	}
}
