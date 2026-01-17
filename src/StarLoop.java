public class StarLoop {
    public static void main(String[] args) {
        starPrint();
    }
    public static void starPrint(){
        int i = 0;
        while (i < 20){
            System.out.print("*");
            int j = 0;
            while (j < i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
   }
}
















