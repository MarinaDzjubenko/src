package homeworks;

public class HW13 {

        public static void main(String[] args) {
            int[] myArray = new int[] {3453, 645, 867, 4233, 5756, 678678, 887, 9787, 767, 3};
            System.out.println("Original array: " );
            for (int i = 0; i < myArray.length; i++)
                System.out.print(myArray[i] + " ");
            System.out.println();
            System.out.println("Maximum value for the above array = " + max(myArray));
            System.out.println("Minimum value for the above array = " + min(myArray));
        }
        public static int max(int[] numbers) {
            int max = -1;
            for (Integer number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
        public static int min(int[] numbers) {
            int min = Integer.MAX_VALUE;
            for (Integer number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }
    }

