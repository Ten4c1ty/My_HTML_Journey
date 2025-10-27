public class Task02{
    public static void main(String [] args){
        int total = 0;
        for(int i=1; i <=600; i++){
            if((i%7 == 0 || i%9 == 0) && !(i%7 == 0 && i%9 == 0)){
                total+=i;
                }
        }
        System.out.println(total);
    }
}