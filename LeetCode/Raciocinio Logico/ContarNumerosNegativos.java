public class ContarNumerosNegativos{

    public static void main(String[] args) {
 
        
//entrada
int[] numeros = {2,-3,-5};
int negativo = 0;

//Processamento
for(int i = 0; i<numeros.length;i++)
{

if(numeros[i] < 0){
    negativo++;
}

}


        System.out.println("Quantidade de negativos: " + negativo);



    }
}

//# 4. Contar números negativos

//Dado um array, conte quantos números são negativos.