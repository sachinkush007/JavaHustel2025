package dsa;

public class CharacterFrequencyPrinter {
    public static void main(String[] args) {

        String s="2a3b4c5d";

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
//                int count=s.charAt(i)-'0';
                int count=Integer.parseInt(String.valueOf(s.charAt(i)));
//                System.out.println(count);
                char ch=s.charAt(i+1);

                for(int j=0;j<count;j++){
                    System.out.print(j);
                }
            }
        }
    }
}
