public class Operations {

    int add(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    int multiply(int... ints) {
        int product = 1;
        for (int i : ints) {
            product *= i;
        }
        return product;
    }
}
