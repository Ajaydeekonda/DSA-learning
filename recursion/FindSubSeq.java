public class FindSubSeq {
    public static void main(String[] args) {
        subSeq(" ", "abc");

    }

    static void subSeq(String processed, String unProcessed)
    {
        if(unProcessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        
        subSeq(processed+unProcessed.charAt(0), unProcessed.substring(1));
        subSeq(processed, unProcessed.substring(1));
    }
}
