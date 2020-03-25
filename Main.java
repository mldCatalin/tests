public class Main {

    public static void main(String[] args) throws Exception {
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        palindromeFinder.findPalindrome(new String[]{"bat", "tab", "cat", "XaS", "ttac", "sax",});
        
        IntegerFrequencyChecker integerFrequencyChecker = new IntegerFrequencyChecker();
        integerFrequencyChecker.findMostFrequent(new int[]{0, 0, 0, 3, 3, 4, 0, 1, 5, 1, 6, 1, 9, 1, 1});
    
        AnagramFinder anagramFinder = new AnagramFinder();
        anagramFinder.checkForAnagram("xassxm", "assmxx");
        
        PeakElementFinder peakElementFinder = new PeakElementFinder();
        peakElementFinder.findPeak(new int[]{1, 2, 3, 1});
        
        SimilarityFinder similarityFinder = new SimilarityFinder();
        similarityFinder.checkSimilarity("catalin", "clatain");
    }
}
