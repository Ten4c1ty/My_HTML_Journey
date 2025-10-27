public class Test02{
    public static void main(String [] args){
       int a = 1;
       int b = 2;
       int operations = 0;
       if(a==b){
       } 
       else {
        for(int i = 1; i <= 1000; i++){
            if(a < b){
                if(a*i == b){
                    operations++;
                }
            }
            else if(b<a){
                if(b*i == a){
                    operations++;
                }
            }
            else{
                for(int j = 1; j <= 1000; j++){
                    if(a*i == b*j){
                        operations+=2;
                    }
                }
            }
        }
       }
       System.out.print(operations);
    }
}
