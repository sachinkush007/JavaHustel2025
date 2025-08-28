package exception;

public class ExceptionHandler{
   public static String getName(int id) throws CustomException {
        String name=null;
        if(name!=null){
            return name;
        }
        else {
//            try {
                throw new CustomException("user not found");
//            }
//            catch (CustomException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public static void main(String[] args)  {
       try {
            System.out.println(getName(1));
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
