package guru.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(78));
        assertNotEquals(new Dollar(5), new Franc(5));
    }

    @Test
    void testSummationWithDrowBackDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.summation(56);
        assertEquals(new Dollar(61), product);
        product = five.summation(10);
        assertEquals(new Dollar(15), product);

    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(78));
    }

    @Test
    void testSummationWithDrowBackFranc() {
        Franc five = new Franc(5);
        Franc product = five.summation(56);
        assertEquals(new Franc(61), product);
        product = five.summation(10);
        assertEquals(new Franc(15), product);

    }
}
