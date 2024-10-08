package javacourse.DSA.Hashmap;
// import java.util.HashMap;
import java.util.*;
import java.lang.Iterable;
public class hashmap {
    public static void main(String[] args) {
        // HashMap<String,Integer> Map = new HashMap<>();
        // Map.put("India", 50);
        // Map.put("china", 100);
        // Map.put("Pak", 45);
        // Map.put("Indonesia", 45);
        // Map.put("America", 45);
        // Map.put("South Africa", 45);
        // Map.put("Canada", 45);
        // System.out.println(Map);
        // System.out.println(Map.get("Ajay"));
        // System.out.println(Map.containsKey("Ajay"));
        // System.out.println(Map.remove("Ajay"));
        // System.out.println(Map.size());
        // System.out.println(Map.isEmpty());
        // Set<Map.Entry<String, Integer>> keys = Map.entrySet();
        // for( String str: keys)
        // {
        //     System.out.println(str+ ":-"+Map.get(str) ); 
            
        // }
        // Iterator<Map.Entry<String,Integer>> i = keys.iterator();
        // while(i.hasNext())
        // {
        //     Map.Entry<String,Integer> key = i.next();
        //     System.out.println(key );
        // }

        // LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        // lhm.put("Ajay",1);
        // lhm.put("Abhinaya",2);
        // System.out.println(lhm);

        // TreeMap<Integer,String> tm= new TreeMap<>();
        // tm.put(2,"Abhinaya");
        // tm.put(1,"Ajay");
        // System.out.println(tm);

        // System.out.println(Anagram("bcdf ", "bcda"));

        HashMap<String,String> map = new HashMap<>();
        map.put("chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");
        System.out.println(Itinerary(map));


        
    }

    public static void Frequency()
        {
            int [] nums = {1,3,2,2,2,2,5,5,5,1,3,1,5,1};
            HashMap<Integer,Integer> hm = new HashMap<>();
            int n = nums.length;
            for (int i : nums) {

            }
            ArrayList<Integer> arayList = new ArrayList<>();
            for(Integer key : hm.keySet())
            {
            if(hm.get(key) >= n/3)
            {
            arayList.add(key);
            }
            }
            int [] arr = new int [arayList.size()];
            for(int i =0;i< arayList.size();i++)
            {
            arr[i] = arayList.get(i);
            }
            System.out.println(Arrays.toString(arr));

        }

    public static boolean Anagram( String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : str1.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        for(char ch : str2.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0)
                {
                    hm.remove(ch);
                }
            }
            else
            {
                return false;
            }
            
        }
        return hm.isEmpty();
        }

        public static int [] major( int [] arr, int k)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(i,map.getOrDefault(i, 0)+1);
            }
            int max = 0;
            int [] array = new int[k];
            for(int j =0;j<k;j++)
            {
                for(Integer i : map.keySet())
                {
                    if(map.get(i) > max)
                    {
                        max = map.get(i);
                    }
                }
                array[j] = max;
            }
            return array;   
        }


        public static String Itinerary(HashMap<String,String> map)
        {
            StringBuilder sb = new StringBuilder();
            String starting ="";
            for(String key : map.keySet())
            {
                if(!map.containsValue(key))
                {
                    starting = key;
                }
            }
            sb.append(starting);
            for(int i =0;i<map.size();i++)
            {
                sb.append("->"+map.get(starting));
                starting = map.get(starting);
            }
            return sb.toString();
        }

    }


