import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PokerGame {

    public PokerGame(){

    }

//    USING AN ARRAYLIST
    public boolean checkIfFlush(String[] cards){
//        create an arraylist of all suits in the hand
        ArrayList<Character> suitList = new ArrayList<>();

        for (String card : cards){
            suitList.add(card.charAt(card.length() - 1)); // adds last char in each string to suitList
        }

//        grab first element in the suitList array and compare to all other elements
        Character firstElement = suitList.get(0);

        for (Character suit : suitList){
            if(!firstElement.equals(suit)){
                return false;
            }
        }
        return true;

    }

//    ALTERNATIVE SOLUTIONS

//    USING STREAMS:
    public boolean checkIfFlush2(String[] cards){ // remove '2' and run tests
        char targetChar = cards[0].charAt(cards[0].length() - 1);
        boolean result = Arrays.stream(cards).allMatch(str -> str.charAt(str.length() - 1) == targetChar);
        return result;
    }

//    //////////////////////////////////////

//    USING A SET:
     public boolean checkIfFlush3(String[] cards){

//        create a set of all suits in the hand
          Set<Character> suitSet = new HashSet<>();

          for (String card : cards){
              suitSet.add(card.charAt(card.length() - 1)); // only unique values are added to a set
          }

//        check if size of set is 1
          if (suitSet.size() == 1){
               return true;
          }

          return false;

      }


}
