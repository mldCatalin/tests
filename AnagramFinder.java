import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//30min max allocated
class AnagramFinder {
    
    //Given two strings s and t, write a function to determine if t is an anagram of s.
    
    void checkForAnagram(String s, String t) {
        List<Character> charList = new ArrayList<>();
        for (Character character : s.toCharArray()) {
            charList.add(character);
        }
        for (Character character : t.toCharArray()) {
            if (charList.contains(character)) {
                charList.remove(character);
            } else {
                System.out.println("not an anagram");
                return;
            }
        }
        if (charList.size() == 0) {
            System.out.println("myes, anagram");
        } else {System.out.println("not an anagram");}
    }
    
    void checkForAnagram2(String s, String t) {
        List<Character> charListS = new ArrayList<>();
        for (Character character : s.toCharArray()) {
            charListS.add(character);
        }
        List<Character> charListT = new ArrayList<>();
        for (Character character : t.toCharArray()) {
            charListT.add(character);
        }
        if (charListS.size() != charListT.size()) {
            System.out.println("not an anagram");
            return;
        }
        Collections.sort(charListT);
        Collections.sort(charListS);
        
        for (int i = 0; i < charListS.size(); i++) {
            if (!charListS.get(i).equals(charListT.get(i))) {
                System.out.println("not an anagram");
                return;
            }
        }
        System.out.println("yay, anagram");
    }
}
