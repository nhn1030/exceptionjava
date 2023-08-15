package calmode;

public class program {
    public static void main(String[] args) throws exceptUnderZero {

        int result = 0;

        try {
            result = calculator.add(3, 10000);
        }
        catch (exceptOverThousand e) {
           System.out.println(e.getMessage());
        }
        System.out.printf("add : %d\n", result);

        result = calculator.sub(3, 4);
        System.out.printf("sub : %d\n", result);

        result = calculator.multi(3, 4);
        System.out.printf("multi : %d\n", result);

        result = calculator.div(3, 4);
        System.out.printf("div : %d\n", result);


    }
}
