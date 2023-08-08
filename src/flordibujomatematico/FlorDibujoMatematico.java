package flordibujomatematico;

import java.util.Scanner;

public class FlorDibujoMatematico {

  public static void main(String[] args) 
  {        
  
     Scanner leer=new Scanner(System.in);
     int largoLados;
     int puntos;
     int i = 0;
     int j=0;   
     int canPuntos=0;     
     int dejarEspacios;
     System.out.print("Ingrese la cantidad de puntos de los lados: ");
     largoLados=leer.nextInt();       
     if (largoLados!=0)
     {
        for (i=1; i<=largoLados; i++)
        {
          dejarEspacios=(largoLados*2-i);                   
          System.out.print(florDibujoMatematicoHacerEspacios.espacios(dejarEspacios));              
          for (j=1; j<=(largoLados-1+i); j++)
          {   
              System.out.print("* ");              
              canPuntos++;                    
          }          
          System.out.println("");             
        }     
        int limiteJ=j-2;      
        for (i=largoLados; i>1; i--)
        {
          dejarEspacios=(largoLados*2-i+1);                   
          System.out.print(florDibujoMatematicoHacerEspacios.espacios(dejarEspacios)); 
          for (j=1; j<=(largoLados-2+i); j++)
          {                 
              System.out.print("* ");              
          }          
          System.out.println("");             
        }
     }     
     System.out.println("Cantidad de Puntos: "+(canPuntos*2-(largoLados*2-1)));        
  }
    
}
