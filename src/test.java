public class test {

    public static int leastCommonMultiple(int a, int b) {

        int big = 0;
        if(a>b) {
            big = a;
        } else big = b;

        for(int i = big; i > 0; i++){
            if(i % a == 0 && i % b == 0){
                return i;
            }
        } 
        return big;

    }

    public static void main(String[] args){

        System.out.println(leastCommonMultiple(5, 15));
        System.out.println(leastCommonMultiple(18, 6));
        System.out.println(leastCommonMultiple(14, 21));
        System.out.println(leastCommonMultiple(1, 12));
    }













}
