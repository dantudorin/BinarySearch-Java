public class BinarySearch {

    public static void main(String[] args) {
        //Array of elements must be sorted before we apply binary-search
        int[] sortedNumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(sortedNumbers,3,0,sortedNumbers.length - 1));
    }
    public static boolean binarySearch(int[] sortedArray,int valueThatWeAreSearching,int leftPosition,int rightPosition){
        //This means that we searched through all numbers and could not find anything
        if(leftPosition > rightPosition) {
            return false;
        }
        int middle = (leftPosition + rightPosition)/2;
        if(sortedArray[middle] == valueThatWeAreSearching) {
            return true;
        }else if(sortedArray[middle] > valueThatWeAreSearching){
            return binarySearch(sortedArray,valueThatWeAreSearching,leftPosition,middle - 1);
        }else{
            return binarySearch(sortedArray,valueThatWeAreSearching,middle + 1, rightPosition);
        }
    }
}
