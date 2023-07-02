/**
 * Codigo para calculadora simples em java
 * 
 */

import java.util.Scanner;
 
 public class Calculadora{
         double soma =  0.0;
         double sub = 0.0;
         double mult = 0.0;
         double div = 0.0; 
         double Scanner;
         double a;
         double num1;
         double num2;
         double select;
         double result;

      //metodo principal

      /**
     * @param args
     */
    public  static void main (String[] args){    int total;
       

        Scanner a =  new Scanner(System.in);
        

       
        System.out.println("Bem vindo ao calcLOG  ");
    

        //area de entrada de dados...

        System.out.println("Entre com o primeiro número: ");
        double num1 = a.nextDouble();
        System.out.println("Entre com o segundo número:  ");
         double num2 =a.nextDouble();
        select = a.nextDouble();
                                             
           double result = 0;
                                             
            switch(select){
       
                case 1:
                        
                         
                        soma = num1+num2;
                        System.out.println("a soma é: "+soma);
                
                    

                    case 2:
                        
                        sub = num1 - num2;
                        System.out.println("a subtração é: "+sub);
            
                    case 3:  
                        
                        mult = num1 * num2;
                        System.out.println("a multiplição é: "+mult);
                    
                    case 4: 
                        
                        div = num1 / num2;
                        System.out.println("a divisão é: "+div);
              

                    default : System.out.println("Entre com o numero de 1 a 4 sendo para: 1- Soma, 2-subtração, 3-multiplicação, 4-divisão.");
                }
            
            System.out.println(" o resultado da operação é:   " +result );

                                            }

 }
