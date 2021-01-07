package seventh;

import java.util.Random;

class RandUser {
    final int userSize = 20;
    int[] arrUser = new int[userSize];

    public void RandNum() {
        for (int i = 1; i <= userSize; i++) {
            int GivenNum = (int) (Math.random() * 20) + 1;
            System.out.printf("%d 번 사원의 할당번호는 %d. \n", i, GivenNum);
        }
    }

    public static class Hw07_20200107 {
        public static void main(String[] args) {
            // 7) 총 20명의 사원이 있다고 가정한다.
            //    20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 허용)
            RandUser ru = new RandUser();
            ru .RandNum();

        }
    }
}
