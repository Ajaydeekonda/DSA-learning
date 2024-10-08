package javacourse.DSA.stringBuffer;
import java.util.Random;
import java.lang.Math;

public class stringBuffer {

    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // sb.append("weMakeDevs");
        // String str = sb.toString();
        // System.out.println(str);
        // System.out.println(sb.codePointBefore(2));
        // System.out.println(sb.codePointCount(2,6));
        // int min = 65;
        // char start = 'A';
        // char end = 'z';
        // int chCode = (int)(Math.random()* ((int)end - (int)start)+ min);
        // System.out.println(chCode);
        // Random random = new Random();
        // System.out.println(random.nextFloat());
        System.out.println(RandomString(10));


    }

    public static String RandomString(int size)
    {
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            sb.append((char)(97+(random.nextFloat()*26)));
        }
        return sb.toString();
    }
    
}
