package seventh;

class Find2N {
    int i;

    public void setNum() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("2의 배수: " + i);
            }
        }
    }
}

public class Hw03_20210107 {
    public static void main(String[] args) {
        // 3) 1 ~ 20 까지의 숫자중 2 의 배수를 출력하도록 매서드를 만들어보자!
        Find2N f2 = new Find2N();
        f2.setNum();


    }
}
