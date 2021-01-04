package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    public <E> List<E> of(int number) {
        if (isZeroOrOne(number)) {
            return Collections.emptyList();
        }
        return getFactors(number);
    }

    private <E> List<E> getFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        int factor = 2;
        while (number > 1) {
            while (isDivisible(number, factor)) {
                number = number / factor;
                factors.add(factor);
            }
            factor++;
        }
        return (List<E>) factors;
    }

    private boolean isDivisible(int number, int factor) {
        return number % factor == 0;
    }

    private boolean isZeroOrOne(int number) {
        return number == 0 || number == 1;
    }
}
