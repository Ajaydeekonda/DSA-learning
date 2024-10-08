public class reverse_a_number {
    public static void main(String[] args) {

        int num = 1234;
        
        System.out.println(reverse(num,0));
        
    }
    

    static int reverse(int num,int sum)
    {
        
        if(num == 0)
        {
            return sum;
        }
        sum = sum*10 + num%10;
        return reverse(num/10,sum);
        


    }
}
