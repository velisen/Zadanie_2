public class Main {
//Binary search algorithm with time complexity O(logN) and space complexity O(1)
    private static boolean search(int[] numbers, int x){
        int left = 0;
        int right = numbers.length-1;

        while(left<=right) {
            int mid = (left+right)/2;

            if(x == numbers[mid]) {
                return true;
            }
            if(x < numbers[mid]){
                left = mid +1;
            }
            if (x > numbers[mid]){
                right = mid -1;
            }
        }
        return false;
    }


    public static void main(String[] args) {


        //tests for search function uncomment this block of code to check
/*      int[] numbers = {5,4,3,2,1};
        int x = 2;
        System.out.println(search(numbers,x));

        int[] numbers2 = {7,6,5,4,3,2,1,0};
        x = 9;
        System.out.println(search(numbers2,x));
*/

    }
}