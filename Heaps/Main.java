package javacourse.DSA.Heaps;
class Main
{
    public static void main(String   [] args) throws Exception
    {
        heap<Integer> h = new heap<>();
        int [] arr = {9,8,7,6,5,4,3,2,1};
        for(int a: arr)
        {
            h.insert(Integer.valueOf(a));
        }
        System.out.println(h.heapSort());
    }
}