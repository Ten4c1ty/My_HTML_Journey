public class dislikeofthrees{
    public static void main(String [] args){
        int i = 1;
        int j = 1000;
        for(int k = i; k <= 1000; k++){
            if((k%3 == 0 || k%10 == 3)){
            }
            else{
                System.out.println(k);
            }
        }
    }
}