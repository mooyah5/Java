package secondClass_VendingMachine;

public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean();  // Heap이라는 메모리에 인스턴스 생성

        System.out.println("1) className");
        math.printClassName();
        System.out.println();

        System.out.println("2) printNumber");
        math.printNumber(100);
        System.out.println();

        System.out.println("3) getOne");
        int getone = math.getOne();
        System.out.println(getone);
        System.out.println();

        System.out.println("4) plus");
        int plus = math.plus(2, 3);
        System.out.println(plus);
    }
}
