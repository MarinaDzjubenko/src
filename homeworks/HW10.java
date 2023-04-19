package homeworks;

public class HW10 {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original array: ");
        for (int i=0; i<myArray.length; i++)
            System.out.print(myArray[i]+" ");

        System.out.println();

        System.out.println("Reverse array: ");
        for (int i = myArray.length-1; i>=0; i--){
            System.out.print(myArray[i] + " ");
        }
        /*...*/
    }
}
