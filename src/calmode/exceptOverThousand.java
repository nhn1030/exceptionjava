package calmode;

public class exceptOverThousand extends Throwable {
    @Override
    public String getMessage() {
        return "천이 넘는 값이 입력되었습니다.";
    }
}
