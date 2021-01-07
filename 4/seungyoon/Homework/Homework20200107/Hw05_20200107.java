package seventh;

class Find6N{
    int i;
    public void setNum(){
        for(int i = 3; i <= 33 ; i++){
            if( i % 2 == 0 || i % 3 == 0){
                System.out.println("2와 3의 배수: "+ i);
            }
        }
    }
}

public class Hw05_20200107 {
    public static void main(String[] args) {
        // 5) 3 ~ 33 까지의 숫자중 2 의 배수 또는 3 의 배수인 수를 출력해보자!
        Find6N f6 = new Find6N();
        f6 .setNum();
    }
}
