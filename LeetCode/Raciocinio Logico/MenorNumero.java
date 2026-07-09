
public class MenorNumero {

public static void main(String[] args) {

    int[] numeros = {8,3,4};

int menor = numeros[0];



for (int i = 0; i <numeros.length ; i++){

if(numeros[i] < menor){
    menor = numeros[i];

}

}
  System.out.println("sou o menor" +  menor);
}


}


