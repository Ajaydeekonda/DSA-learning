
public class program1 {
    public static void main(String[] args) {
        // print(1);
       print(5);
       //fibonaacci(0,1 );
    //    int [] arr ={1,2,3,4,5,6,7,8,9,10};
    //    if(binary(arr, 4, 0, arr.length))
    //    {
    //     System.out.println("found");
    //    }
    //    else
    //    {
    //     System.out.println("Not Found");
    //    }

    }

    static void print4(int num)
    {
        print2(2);
        System.out.println(num);
    }

    static void print2(int num)
    {
        print3(3);
        System.out.println(num);

    }
    static void print3(int num)
    {
        System.out.println(num);
    }

    static void print(int num)
    {
        System.out.println(num);
        num-=1;
        if(num>0)
        {
            print(num);
            System.out.println(num + "--!");
            printRev(num);

        }
        
        
    }

    static void printRev(int num)
    {
        System.out.println(num);
    }


    static void fibonaacci(int num1,int num2)
    {
        int res = num2 + num1;
        if(res > 20)
        {
            System.out.println("last function");
            return;
        }
        fibonaacci(num2,res);
        System.out.println(res);

    }

    static int f(int n)
    {
        if(n<=1)
        {
            return n;

        }
        return f(n-1)+f(n-2);
    }

    
}
