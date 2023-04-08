package firstClass;

public class while1 {
    public static void main(String[] args){
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
            if (i == 6) {
                System.out.println("6이어도 바로 안나가지");
            }
        }
    }
}
