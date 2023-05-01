import java.util.*;
/*
@DIANA LAURA DOMINGUEZ LOPEZ
@diann.domm15@gmaoil.com
@description clase de generadora tokens
 */

public class Main{

    //psvm
       /*
        @metodo principal
        @descripcion clase generadora de tokens

        */

       public static void main (String [] args) {
           Token token = new Token();
           System.out.println(token.obtenerAlfabeto());
           System.out.println(token.generarToken());

           ArrayDeque<String>cola=new ArrayDeque<>();
           for (int i=0;i<=10;i++){
               cola.add(token.generarToken());
       }
       System.out.println(cola);
       Iterator tokenGuardados = cola.iterator();
       System.out.println("los valores de la lista de tokens es:");
       while(tokenGuardados.hasNext()){
           System.out.println(tokenGuardados.next());

       }


    }//
} // fin clase My
