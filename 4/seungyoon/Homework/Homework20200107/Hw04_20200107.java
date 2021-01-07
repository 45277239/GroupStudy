package seventh;

class FindNum {
    int i;

    public void setNum() {
        for (int i = 1; i <= 20; i++){
            if(i % 2 == 0 && i % 3 ==0){
                System.out.println("2와 3의 중복되는 배수: "+ i);
            }
        }
    }
}

public class Hw04_20200107 {
    public static void main(String[] args) {
        // 4) 1 ~ 20 까지의 숫자중 2 의 배수이고 3 의 배수인 수를 출력해보자!
        FindNum fn = new FindNum();
        fn.setNum();
    }
}
