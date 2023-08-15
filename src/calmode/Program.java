package calmode;

public class Program {
    public static void main(String[] args) {

            int result = calculator.add(3, 10);
            System.out.printf("add: %d\n", result);

            result = calculator.sub(5, 4);
            System.out.printf("sub: %d\n", result);

            result = calculator.multi(3, 4);
            System.out.printf("multi: %d\n", result);

            result = calculator.div(3, 4);
            System.out.printf("div: %d\n", result);
        }
}

