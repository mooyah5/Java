package secondClass_VendingMachine;

public class VendingMachine {
    public String puchProductButton(int menuId) {
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    public static void printVersion() {
        System.out.println("v1.0");
    }
}
