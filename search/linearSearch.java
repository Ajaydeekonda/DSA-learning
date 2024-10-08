package java.DSA.search;
public class linearSearch {
    public static void main(String[] args) {

        // int[] arr ={1,2,3,4,5,6};

        // int target =6;// index = 3;
        // System.out.println(linSearch(arr, target,-1,5));
        // System.out.println(minimun(arr));
        // System.out.println(linSearch2(arr, index));

        // String arr = "Hello,World!";
        // char target = 'W';
        // System.out.println(Search(arr, target));

        // int [][]arr = {{1,2,3},{23,36,26,79},{538,35,46,63,9}};
        // int target = 9;
        // String result = search(arr, target);
        // System.out.println(result);

        int [] arr = {1244,3455,2,6,7896};
        System.out.println(Even(arr));


        
    }

    // static int linSearch(int [] arr, int target)
    // {
    //      if(arr.length == 0)
    //     {
    //         return -1;
    //     }

    //     for( int index =0 ; index <arr.length;index++)
    //     {
    //         int element = arr[index];

    //         if(target == element)
    //         {
    //             return index;
    //         }
    //     }

    //     return -1;
    // }


    static int linSearch(int [] arr, int target, int start,int end)
    {
         if(arr.length == 0)
        {
            return -1;
        }
        if(end > arr.length || start < 0)
        {
            System.out.println("Invalid Start or End");
            return -1;
        }

        for( int index =start ; index <= end;index++)
        {
            int element = arr[index];

            if(target == element)
            {
                return index;
            }
        }

        return -1;
    }

    // static int linSearch2(int [] arr, int index)
    // {
    //      if(arr.length == 0 || index > arr.length)
    //     {
    //         return -1;
    //     }

    //     return arr[index];
    // }

    // static boolean Search (String arr, char target)
    // {
    //     if(arr.length() == 0)
    //     {
    //         return false;
    //     }

    //     // for(int i =0 ;i< arr.length();i++)
    //     // {
    //     //     if(target == arr.charAt(i))
    //     //     {
    //     //         return true;
    //     //     }
    //     // }

    //     for( char ch : arr.toCharArray())
    //     {
    //         if(ch == target)
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    static int minimun (int [] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        int  min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
           
            if(min>arr[i])
            {
                min = arr[i];
            }

        }
        return min;
    }

    // static String  search (int [][] arr,int target)
    // {
    //     StringBuilder s = new StringBuilder();
    //     int i=0,j=0;
        
    //     if(arr.length == 0)
    //     {
    //         s.append(-1);
    //         return s.toString();
    //     }
    //     else
    //     {
    //         for(int [] rows : arr)
    //         {         
    //             for(int elements : rows)
    //             {

    //                 if(elements == target)
    //                 {
                        
    //                     s.append((char)i).append((char)j);
    //                     return s.toString();
    //                 }
    //                 j+=1;
    //             }
    //             i+=1;
    //         }
    //     }
    //     s.append(-1);
    //     return s.toString();

    // }
    
        static String search(int[][] arr, int target) {
            StringBuilder s = new StringBuilder();
            int rowNum = arr.length;
    
            if (rowNum == 0) {
                s.append(-1);
                return s.toString();
            } else {
                for (int i = 0; i < rowNum; i++) {
                    int colNum = arr[i].length;
                    for (int j = 0; j < colNum; j++) {
                        if (arr[i][j] == target) {
                            s.append("Row: ").append(i).append(", Column: ").append(j);
                            return s.toString();
                        }
                    }
                }
            }
            s.append(-1);
            return s.toString();
        }
    

        public static int Even( int [] arr)
        {
            int len = arr.length;
            int result =0;
            
            for(int i=0;i<arr.length;i++)
            {
                int count =0;
                while(arr[i]!=0)
                {
                    arr[i] = arr[i]/10;
                    count+=1;
                }
                if(count%2 ==0)
                {
                    result+=1;

                }
            }
            return result;
        }


    
}
