package collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeAndFailFast {
    public static void main(String[] args) {
        List<Integer>ratingList=new CopyOnWriteArrayList<>();
        ratingList.add(1);
        ratingList.add(2);
        ratingList.add(4);
        ratingList.add(5);
        System.out.println(ratingList);

        Iterator<Integer>iterator=ratingList.iterator();
        while (iterator.hasNext()){
            Integer rating=iterator.next();
            System.out.println("RATING: "+rating);
            ratingList.remove(Integer.valueOf(1));

        }

        for (Integer i:ratingList){
            System.out.println(i);
            ratingList.add(7);
        }
    }
}
