package calmode;

public class program {
    public static void main(String[] args) throws exceptUnderZero, exceptOverThousand {

        int result = 0;

        result = calculator.add(3, -4);
        System.out.printf("add : %d\n", result);

        result = calculator.sub(3, 4);
        System.out.printf("sub : %d\n", result);

        result = calculator.multi(3, 4);
        System.out.printf("multi : %d\n", result);

        result = calculator.div(3, 4);
        System.out.printf("div : %d\n", result);


    }
}
