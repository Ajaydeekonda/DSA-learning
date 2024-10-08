public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(Odd(2));
        
    }

    public static boolean Odd(int num)
    {
        return (num&1) == 1;
    }
}
