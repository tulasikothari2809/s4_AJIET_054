public class Main {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 5, 30};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Lowest element = " + min);
    }
}
