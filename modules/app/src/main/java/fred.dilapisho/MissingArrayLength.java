package fred.dilapisho;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class MissingArrayLength {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (resultIsZero(arrayOfArrays)) {
            return 0;
        }
        Arrays.sort(arrayOfArrays,
                Comparator.comparingInt(array -> array.length));

        AtomicInteger result = new AtomicInteger(arrayOfArrays[0].length);
        for (Object[] entry : arrayOfArrays) {
            int difference = entry.length - result.get();
            if (difference == 0) {
                continue;
            }
            if (difference != 1) {
                break;
            }
            result.set(entry.length);
        }
        return result.get() + 1;
    }

    private static boolean resultIsZero(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null)
            return true;
        if (arrayOfArrays.length == 0)
            return true;
        return Arrays.stream(arrayOfArrays)
                .anyMatch(array -> {
                    if (array != null && array.length == 0) {
                        return true;
                    }
                    return array == null;
                });
    }

}
