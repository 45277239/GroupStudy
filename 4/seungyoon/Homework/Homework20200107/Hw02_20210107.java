package seventh;

class AddNum {
    int i;
    int sum = 0;

    public void setNum() {
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.print("1~10까지의 총합: "+ sum);
    }
}

public class Hw02_20210107 {
    public static void main(String[] args) {
        // 2) 1 ~ 10 까지의 숫자를 더한 결과를 출력하도록 매서드를 만들어보자!
        AddNum ad = new AddNum();
        ad.setNum();
    }

}
