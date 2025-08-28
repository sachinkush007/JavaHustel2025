package java8;

import java.util.List;

public class JavaQues {
    public static int findMax(List<Integer> list){
        //list.stream().max((a,b)->a-b).orElseThrow();
        return list.stream().max(Integer::compare).orElseThrow();
    }

    public static long countEven(List<Integer> list){
      long count= list.stream().filter(e->e%2==0).count();
      return count;
    }
    public static List<String> toUpperCase(List<String> stringList){
        List<String>list=stringList.stream().map(e->e.toUpperCase()).filter(e->e.endsWith("A")).toList();
        return list;
    }

    public static List<String> filterNameStartWith(List<String> stringList) {
        List<String> list= stringList.stream().filter(e->e.startsWith("a")).toList();
        return list;
    }
        public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5,6,7,8,9);
        List<String>stringList=List.of("sachin","akash","anku","vishal","bhawna");
        System.out.println("Max: "+findMax(list));
        System.out.println("*******************************************");
        System.out.println("Even's: "+countEven(list));
        System.out.println("*******************************************");
        System.out.println("In Uppercase: "+toUpperCase(stringList));
        System.out.println("*******************************************");
        System.out.println("Start With A: "+filterNameStartWith(stringList));
    }
}
