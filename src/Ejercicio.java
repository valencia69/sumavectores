public class Ejercicio {

    public static int sumavector(int[] vector , int indice){
        int suma;


        if (indice == vector.length - 1){

            suma    = vector[indice];


        }else{
            suma = vector[indice] + sumavector(vector, indice +1);
        }
      return  suma;
    }
}
