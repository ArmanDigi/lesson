public class Task36 {
    public static void main(String[] args) {


        int x = 6, y = 5, z = 7;
        if ( (x % 2 != 0 && y % 2 != 0) || (y % 2 != 0 && z % 2 != 0) || (x % 2 != 0 && z % 2 != 0)){
            System.out.println("Մեկ");}
        else {
            System.out.println("Երկու");
        }
    }
}
