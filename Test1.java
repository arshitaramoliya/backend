public class Test1{
    public static void main (String [] args){
        int a=14;
        if(a%7==0){
            System.out.println("divisible by 7: "+ a);
        }else{
            System.out.println("Not divisible by 7: "+a);
        }
    }
}
// Added: Star pyramid pattern
class StarPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
    }
}
