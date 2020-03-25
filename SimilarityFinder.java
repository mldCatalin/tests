//30min max allocated
class SimilarityFinder {
    
    //Given two strings S and T, determine if they are both one edit distance apart.
    //(Edit poate sa insemne insert/remove/change character)
    
    void checkSimilarity(String s, String t) {
        int changes = 0;
        
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(i))
                    changes++;
            }
            if (changes > 1) {
                System.out.println("more than one edit away");
                return;
            }
        } else if (s.length() == t.length() + 1) {
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(j) && changes < 1) {
                    changes++;
                    j++;
                }
            }
        } else if (t.length() == s.length() + 1) {
            int j = 0;
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) != s.charAt(j) && changes < 1) {
                    changes++;
                    j++;
                }
            }
        }
        else{
            System.out.println("more than one edit away");
            return;
        }
    
        System.out.println("myes, one edit away");
    }
}
