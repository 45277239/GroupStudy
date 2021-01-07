package seventh;

class Fibo {
    int a = 1;
    int b = 1;
    int c ;

    public void setNum() {
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i < 30; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}

public class Hw06_20200107 {
    public static void main(String[] args) {
        // 6) 피보나치 수열을 배열 없이 만들어서 출력해보도록 만든다.
        Fibo fb = new Fibo();
        fb .setNum();
    }
}
