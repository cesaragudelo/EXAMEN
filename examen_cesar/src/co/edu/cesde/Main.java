package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
       int numpersonas,propina,pedido,hamburguesa=0,perros=0,salchipapas=0,chorizos=0,valorhambur,valorperro,valorsalchipa,valorchori;
       double valortotdescu,valortotcompra=0;

        System.out.println("ingrese la cantidad de personas");
        numpersonas=inputData.nextInt();
        System.out.println("ingrese 1 si desea incluir propina");
        System.out.println("ingrese 2 si no desea incluir propina");
        propina=inputData.nextInt();
        for (int i=1; i<=numpersonas;i++ ){
            System.out.println("ingrese 1 para hamburguesa");
            System.out.println("ingrese 2 para perro");
            System.out.println("ingrese 3 para salchipapas");
            System.out.println("ingrese 4 para chorizos");
            pedido=inputData.nextInt();
            if(pedido==1){
                hamburguesa=hamburguesa+1;
            }
            else if(pedido==2){
                perros=perros+1;
            }
            else if(pedido==3){
                salchipapas=salchipapas+1;
            }
            else if(pedido==4){
                chorizos=chorizos+1;
            }
        }
        if(hamburguesa>0){
            valorhambur=hamburguesa*10000;
            valortotcompra=valortotcompra+valorhambur;
        }
        if (perros>0){
            valorperro=perros*8000;
            valortotcompra=valortotcompra+valorperro;
        }
        if (salchipapas>0){
            valorsalchipa=salchipapas*6000;
            valortotcompra=valortotcompra+valorsalchipa;
        }
        if (chorizos>0){
            valorchori=chorizos*7000;
            valortotcompra=valortotcompra+valorchori;
        }

        if (valortotcompra > 20000){
            valortotdescu = valortotcompra-(valortotcompra*0.10);
            if (propina == 1){
                valortotdescu=valortotdescu+(valortotdescu*0.10);
            }
            if (hamburguesa>1 || perros>1 || salchipapas> 1 || chorizos>1){
                valortotdescu=valortotdescu-(valortotdescu*0.05);
            }
            System.out.println("se le hizo un descuento del 10% por compras mayores a 20000 el total a pagar es de: "+valortotdescu);
            System.out.println();
        }
        else if (valortotcompra < 20000){
            if (propina == 1){
                valortotcompra=valortotcompra+(valortotcompra*0.10);
            }
            if (hamburguesa>1 || perros>1 || salchipapas> 1 || chorizos>1){
                valortotcompra=valortotcompra-(valortotcompra*0.05);
            }
            System.out.println("el valor a pagar es de: "+valortotcompra);
        }

    }
}
