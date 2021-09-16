public class Main 
{
 
    int Num1= 1;
    int Num2 =2;
    int Iterador =10;
    int Suma=0;
    int Contador=0;

    System.out.println(Num1);
    system.out.println(Num2);

    do
    {
        Suma=Num1+Num2;
        System.out.println(Suma)

        Num1=Num2;
        Num2=Suma;


        Contador++;

    }while(Contador<Iterador);

}
