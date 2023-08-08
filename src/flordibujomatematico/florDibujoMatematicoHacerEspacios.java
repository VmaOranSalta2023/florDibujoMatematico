package flordibujomatematico;

public class florDibujoMatematicoHacerEspacios 
{
   public static String espacios(int cantidad)
   {
    String espaciar="";
    for (int i=1; i<=cantidad; i++)
    {
      espaciar=espaciar+" ";
    }       
    return  espaciar;
   }     
}
