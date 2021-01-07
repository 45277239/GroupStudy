package seventh;

import java.util.Random;

class RandUser2 {
    final int userSize = 20;
    int[] arrUser = new int[userSize];

    public void RandNum() {
        int j, GivenNum = 0;
        int[] checkDup = new int[userSize];
        for (j = 0; j < userSize; j++) {
            checkDup[j] = 0;
        }
        for (int i = 0; i < userSize; i++) {
            GivenNum = (int) (Math.random() * 20) + 1;
            checkDup[i] = 1;
            if (checkDup[GivenNum -1] != 0) {
                System.out.println("중복발생");
                continue;
            }
            System.out.printf("%d 번 사원의 할당번호는 %d. \n", i + 1, GivenNum);
        }
    }

}

public class Hw08_20200107 {
    public static void main(String[] args) {
        // 8) 7번 문제를 중복이 허용되지 않도록 만든다
        RandUser2 ru2 = new RandUser2();
        ru2.RandNum();
    }
}

