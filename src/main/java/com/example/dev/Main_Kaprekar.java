/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.stream.Collectors;

public class Main_Kaprekar {

public static void main(String[] args){
    System.out.println("Clase Main");

}
public static int kaprekarOp(int num){
    //validate not all digits are the same
    //num -> biggest - smallest (reorder)
    if (String.valueOf(num).chars().distinct().count() > 1){
        return biggestMinusSmallest(num);
    } else {
        return 0;
    }
}

public static int biggestMinusSmallest(int num){
    //convert to string and sort
    return biggestReorder(num) - smallestReorder(num);
}

public static int biggestReorder(int num){
    //convert to string and sort in descending order
    return Integer.parseInt(String.valueOf(num).chars().mapToObj(c -> (char) c).sorted((a, b) -> b - a).map(String::valueOf).collect(Collectors.joining()));
}
public static int smallestReorder(int num){
    //convert to string and sort in ascending order
    return Integer.parseInt(String.valueOf(num).chars().mapToObj(c -> (char) c).sorted().map(String::valueOf).collect(Collectors.joining()));
}

public static int itKaprekar(int num){
    //iterates until kaprekarOp returns 6174
    int count = 0;
    while(num != 6174){
        num = kaprekarOp(num);
        System.out.println(num);
        count++;
    }
    return count;
}
//aquí van sus funciones:

}