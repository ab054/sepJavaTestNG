import org.testng.annotations.Test;

import java.util.Arrays;

public class CodingEx {

    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

    @Test
    public void printHelloAtEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println("hello world");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void swapTwoNumbers_failed() {
        int[] array = {1,2,3,4};
        swap(array, 2, 2);
        System.out.println(Arrays.toString(array));
    }

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }

    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println(result);
    }


    @Test
    public void testMovie() {
        Movie movie = new Movie("Inception", "Nolan", 4.5f);

        movie.realese();

        if(movie.isReleased()){
            movie.watch();
        }
    }
}
