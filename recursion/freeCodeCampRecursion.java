public class freeCodeCampRecursion {
    public static void main(String[] args) {
       
        // String str = "yaaye";
        // System.out.println(palin(str));
        // int dec = 5;
        // int Binary = Dec2Bin(dec);
        // System.out.println(Binary);
        // System.out.println(dec2bin(dec, ""));
        // int inpNum = 10;
        // System.out.println(recursiveSum(inpNum));
        // int num = 200;
        // System.out.println(sum(0, num, 10, 5, 0));
        int num = 5;
        System.out.println(fibo(num));
    }
    

    static boolean palin(String str)
    {
        if(str.length()==0 || str.length()==1)
        {
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1))
        {
            return palin(str.substring(1, str.length()-1));
        }
        return false;
    }

    static Integer Dec2Bin(int num)
    {
        if(num == 1)
        {
            return Integer.valueOf(1);
        }

        return Integer.valueOf(Dec2Bin(num/2) + String.valueOf(num%2));
    }

    static String dec2bin(int num,String result)
    {
        if(num==1)
        {
            return result = 1 + result;
        }
        result= num%2+result;
        return dec2bin(num/2,result);

    }

    static int recursiveSum(int inpNum)
    {
        if(inpNum ==1)
        {
            return 1;
        }

        return inpNum + recursiveSum(inpNum-1);
    }

    static int sum(int count, int num, int step, int addon, int result) {
        if (count > num / 10) {
            return result;
        }
        result += count * 10 + (step + (count - 1) * 10) * 4 + 5 + (count - 1) * 10;
        return sum(count + 1, num, step + 10, addon + 10, result);
    }

    static int fibo(int num)
    {
        if(num==0|| num==1)
        {
            return num;
        }
        else
        {
            return fibo(num-1) + fibo(num-2);

        }
    }
    
    
}
