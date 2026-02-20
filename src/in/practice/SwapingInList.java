package in.practice;

import java.util.Arrays;
import java.util.List;

public class SwapingInList {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList ( 1 , 2 , 8 , 6 , 7 , 94 , 25 , 4);
        System.out.println (list);
        swap ( list, 2, 5 );
        System.out.println (list);

    }

    public static void swap(List<Integer> list, int x, int y){
        int z;
        z = list.get(x);
        list.set ( x, list.get (y) );
        list.set(y, z);
    }

}