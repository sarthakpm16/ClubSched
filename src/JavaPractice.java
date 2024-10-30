public class JavaPractice {
   
    public static int gcf(int a, int b) {
    
    int count = a;
    if (a  >  b) {
    count = b;
    }   
            while(a % count != 0 || b % count != 0) {
                count--;
        } return count;
    }
        public static void main(String[] args) {
            gcf(8, 12);
            gcf(9, 27);
            gcf(46, 18);
            gcf(81, 99);

                }
    }
