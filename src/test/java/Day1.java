import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Day1 {


    @Test
    public void testMethod1() {
        System.out.println("Hello, World!");
    }

    @Test
    public void testNumbers() {
        int amountOfClicks = 5;
        double windowSize = 4.5;

        System.out.println(amountOfClicks);
        System.out.println(windowSize);

    }

    @Test
    public void testCharsAndString() {
        char letterG = 'g';
        String s2 = "Who who who who!";

        System.out.println(letterG);

        System.out.println(s2);
    }

    @Test
    public void testConcat() {
        int numberOfCookies = 4;
        String message = "I have " + numberOfCookies + " cookies";

        System.out.println(message);
    }

    @Test
    public void testBoolean() {
        boolean b = true;

        System.out.println(b);
    }

    @Test
    public void testOperators() {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println(!value1);
        System.out.println(!value2);
        System.out.println(value1 || value2);
        System.out.println(value1 && value2);
    }

    @Test
    public void testConditionals() {

        int a = 5;

        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        } else {
            System.out.println("OOHH! IT IS NOT 4");
        }

    }

    @Test
    public void testArrays() {
        int[] arrayOfInt = {1,3,3,4,5,6,7,8,9,9};

        arrayOfInt[0] = 0;

        String result = Arrays.toString(arrayOfInt);

        System.out.println(result);
    }


    @Test
    public void testForLoops() {

        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
    }

    @Test
    public void testNumbersInArray() {
        int[] arrayOfInt = {1,3,3,4,5,6,7,8,9,9};

        for(int i=0; i < arrayOfInt.length; i++){
            System.out.println(arrayOfInt[i]);
        }
    }
}
