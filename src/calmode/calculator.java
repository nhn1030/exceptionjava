package calmode;

public class calculator {

    public calculator() {
    }

    public static int add(int x, int y) throws exceptOverThousand, exceptUnderZero {

        int result = x + y;

        if (result > 1000)
            throw new exceptOverThousand();

        if (result < 0)
            throw new exceptUnderZero();

        return result;
    }

    public static int sub(int x, int y) throws exceptUnderZero {
        int result = x - y;

        if (result < 0)
            throw new exceptUnderZero();

        return result;
    }

    public static int multi(int x, int y) {

        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
