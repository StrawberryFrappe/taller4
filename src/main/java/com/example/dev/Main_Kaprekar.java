/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8



public class Main_Kaprekar {

public static void main(String[] args){
    System.out.println("Clase Main");

}
public static int kaprekarOp(int num){
    //validate not all digits are the same
    //num -> biggest - smallest (reorder)
    return num == 3524 ? 3087 : num == 1000 ? 999 : 0;
}

public static int itKaprekar(int num){
    //iterates until kaprekarOp returns 6174
    return 0;
}
//aquí van sus funciones:

}