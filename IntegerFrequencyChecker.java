import java.util.HashMap;
import java.util.Map;

//30min max allocated
class IntegerFrequencyChecker {
    
    //Given an array of integers, write a method to return the k most frequent elements.
    
    void findMostFrequent(int[] ints) throws Exception {
        HashMap<Integer, Integer> frqTable = new HashMap();
        for (Integer arrayElem : ints) {
            if (!frqTable.containsKey(arrayElem)) {
                int occurrence = 1;
                frqTable.put(arrayElem, occurrence);
            } else {
                int occurrence = frqTable.get(arrayElem) + 1;
                frqTable.put(arrayElem, occurrence);
            }
        }
        
        Integer key = null;
        Integer occurrence = 0;
        
        for (Map.Entry<Integer, Integer> pair : frqTable.entrySet()) {
            if (pair.getValue() > occurrence) {
                occurrence = pair.getValue();
                key = pair.getKey();
            }
        }
        
        if (key != null) {
            System.out.println(key);
        } else {
            throw new Exception("array is empty");
        }
    }
}
