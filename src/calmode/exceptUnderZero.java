package calmode;

public class exceptUnderZero extends RuntimeException {
    @Override
    public String getMessage() {
        return "0미만의 값이 입력되었습니다.";
    }
}
