import java.lang.invoke.LambdaConversionException;

public class ageCheck{
    public static void main(String[] args) {
        int MyFirstNumber = 20;
        int MySecondNumber = (40+25);
        int MyThirdNumber = 15;
        int MyTotal = MyFirstNumber+MySecondNumber+MyThirdNumber;
        System.out.println(MyTotal);
        int LastOne = 1000-MyTotal;
        System.out.println(LastOne);
    }
}