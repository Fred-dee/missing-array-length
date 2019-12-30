package fred.dilapisho;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingArrayLengthTest {

    @Test
    public void BasicTests() {
        assertEquals(3, MissingArrayLength.getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));
        assertEquals(2, MissingArrayLength.getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));
        assertEquals(2, MissingArrayLength.getLengthOfMissingArray(new Object[][] { new Object[] { null }, new Object[] { null, null, null } } ));
        assertEquals(5, MissingArrayLength.getLengthOfMissingArray(new Object[][] { new Object[] { 'a', 'a', 'a' }, new Object[] { 'a', 'a' }, new Object[] { 'a', 'a', 'a', 'a' }, new Object[] { 'a' }, new Object[] { 'a', 'a', 'a', 'a', 'a', 'a' }} ));

        assertEquals(0, MissingArrayLength.getLengthOfMissingArray(new Object[][] { }));
    }

    @Test
    public void AdvancedTest()
    {
        assertEquals(10,
                MissingArrayLength.getLengthOfMissingArray(
                        new Object[][] {
                                new Object[] {0, 1, 1, 1, 3, 0},
                                new Object [] {3, 1, 3, 0, 0, 0, 3, 4},
                                new Object [] {3, 2, 4, 1},
                                new Object [] {0, 0, 1, 1, 4, 1, 1},
                                new Object [] {0, 3, 0, 0, 4, 0, 1, 0, 4, 1, 1},
                                new Object [] {3, 4, 3, 0, 1},
                                new Object [] {2, 0, 4, 1, 1, 2, 1, 2, 3},
                                new Object [] {0, 1, 0, 4, 0, 3, 3, 2, 0, 0, 4, 0, 0},
                                new Object [] {4, 4, 2, 3, 0, 1, 0, 3, 2, 3, 1, }
                        })
                );
    }
}