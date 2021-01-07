package seventh;

class CountNum {
    int i;

    public void setNum() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}


public class Hw01_20210107 {
    public static void main(String[] args) {
    // 1) 1 ~ 10 까지 출력하는 클래스내의 매서드를 만들어보자!
        CountNum cn = new CountNum();

        cn.setNum();

    }
}
