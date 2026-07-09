
public class SomarNumeros {


public static void main(String[] args) {

//entrada
    int[] numeros = {1,20,3,4,5}; 
int soma = 0;


//percorrer
for(int i = 0 ; i < numeros.length; i++){
System.out.println("Percorrendo Array " + numeros[i]);

    soma = numeros[i] + soma;
}


  //saida
System.out.println("Valor total de Todos os Elementos  "+soma);
    
}

}

//Dado um array de inteiros, retorne a soma de todos os elementos.
//exemplo [1,2,3,4] => 10;