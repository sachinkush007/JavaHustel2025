import java.util.Arrays;

public class NewQues {

    public static Boolean compareArray(Integer[] a1,Integer[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] array1={1,2,3,1,1,2};
        Integer[] array2={3,2,1,1,1,2};

        System.out.println(compareArray(array1,array2));
    }
}
