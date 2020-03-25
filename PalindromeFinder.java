import java.util.ArrayList;
import java.util.List;

//1h max allocated
class PalindromeFinder {
    
    //Given a list of unique words.
    //Find all pairs of distinct indices (i, j) in the given list, so that the concatenation of the two words,
    //i.e. words[i] + words[j] is a palindrome.
    //Example 1:
    //Given words = ["bat", "tab", "cat"]
    //Return [[0, 1], [1, 0]]
    //The palindromes are ["battab", "tabbat"]
    void findPalindrome(String[] wordList) {
        List<List<Integer>> palindromeList = new ArrayList<>();
        for (int i = 0; i < wordList.length; i++) {
            for (int j = 0; j < wordList.length; ) {
                if (i == j) {
                    j++;
                } else {
                    if (isPalindrome(wordList[i] + wordList[j])) {
                        List<Integer> palindromePair = new ArrayList<>();
                        palindromePair.add(i);
                        palindromePair.add(j);
                        palindromeList.add(palindromePair);
                    }
                    j++;
                }
            }
        }
        System.out.println(palindromeList);
    }
    
    private boolean isPalindrome(String x) {
        int i = 0, j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
