package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElementThatAppearsOnlyOnce {

    public static void findElementThatAppearsOnlyOnce(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        int num=0;
        Set<Map.Entry<Integer,Integer>>entrySet=map.entrySet();
        for(Map.Entry<Integer,Integer>entry:entrySet){
           if(entry.getValue()==1){
               System.out.print(entry.getKey()+", ");
           }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 1, 2, 4, 5, 5, 7};
        findElementThatAppearsOnlyOnce(arr);
    }
}
