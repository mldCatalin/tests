//10min max allocated
class PeakElementFinder {
    
    //A peak element is an element that is greater than its neighbors.
    //Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
    //The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
    //You may imagine that num[-1] = num[n] = -∞.
    //For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
    
    void findPeak(int[] array) throws Exception {
        //TODO: nu ai tratat inceputul si finalul. iti zice de num[-1] si num[n] for a reason
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] < array[i] & array[i] > array[i + 1]) {
                System.out.println(i);
                return;
            }
        }
        throw new Exception("no peaks");
    }
}
