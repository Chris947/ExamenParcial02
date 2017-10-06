/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import java.util.Scanner;

/**
 *
 * @author RODOLFO
 */
public class ExamenParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Examen parcial");
        System.out.println("Christian Ferrua Egoavil");
        
        Scanner modelos =new Scanner(System.in);
        String Samsung_S7, Huawey_P8,Iphone_6,x,a,b= null,c = null,d,e= null,f= null,g= null;
        
        
        System.out.println("Catalogo de Equipos en Oferta : ");
        System.out.println(" ");
        System.out.println("1.Samsung S7  ");
        System.out.println("2.Huawey P8  ");
        System.out.println("3.iPhone 6   ");
        System.out.println(" ");
        
        //Ingresar el producto a adquirir
        System.out.println(" Ingrese el numero de equipo que desea: ");
        x=modelos.nextLine();
        
        int X=Integer.parseInt(x);
        
        //Caso para el modelo telefonico Samsung S7
        switch (x){
            
            case "1":
                
                System.out.println(" ");
                System.out.println("Usted a seleccionado el Samsung S7 ");
                System.out.println("caracteristicas del movil " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");
                System.out.println(" ");
                
                System.out.println("Ingrese el operador que desea adquirir : ");
                System.out.println(" ");
                System.out.println("1.Claro ");
                System.out.println("2.Movistar ");
                System.out.println("3.Entel ");
                a=modelos.nextLine();
                int A=Integer.parseInt(a);
                
                //Caso para elegir el operador
                    switch (a){
                        case "1":
                            
                            System.out.println(" ");
                            System.out.println("Usted escogio la operadora movil Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 10 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            b=modelos.next();
                            int B=Integer.parseInt(b);
                            
                           //casos para el tipo de plan
                    
                            switch  (b){
                                case "1":
                                    //operadora movil Claro
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Escogio el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/99.");
                                    
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Escogio el Plan 149 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 8 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/149.");
                                    break;
                            
                            
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Escogio el Plan 189 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 9 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    
                                    System.out.println("El monto mensual a pagar es de S/189.");
                                   break;
                                 }
                                break; 
                                                                
                            
                            
                            
                        case "2":
                            //operadora movil movistar
                            System.out.println(" ");
                            System.out.println("Elegiste la operadora movil Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan 199");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan 299");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            c=modelos.next();
                            int C=Integer.parseInt(c);
                    
                            
                            switch  (c){
                                case "1":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted Adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 6 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/99.");
                                    break;
                                    
                                case "2":
                                    System.out.println("");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 199 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 14 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/199.");
                                    break;
                                    
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 299 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 24 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/299.");
                                    
                                    break;
                                    
                                    }
                            
                                 
                            //operadora movil entel
                            case "3":
                            
                                System.out.println(" ");
                                System.out.println("Elegiste la operadora movil Entel ");
                                System.out.println("Elije un plan para tu equipo : ");
                            
                                System.out.println("1.FunPack 109");
                                System.out.println(" -Precio S/ 109 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 4 GB");
                                System.out.println(" -SMS Ilimitados");
                        
                                System.out.println("  ");
                                System.out.println("2.FunPack 119");
                                System.out.println(" -Precio S/ 119 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 7 GB");
                                System.out.println(" -SMS Ilimitados");
                            
                                System.out.println("  ");
                                System.out.println("3.FunPack 155");
                                System.out.println(" -Precio S/ 155 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 12 GB");
                                System.out.println(" -SMS Ilimitados");
                           
                            b=modelos.next();
                            B=Integer.parseInt(b);
                            
                            switch (b){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/109.");
                                    
                                    break;
                                case "2":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 119 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/119."); 
                                    
                                    break;
                                 
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Samsung S7");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/155.");    
                                    break;
                            }       
                            }
                            break;
                       
                //Caso para el modelo telefonico Huawei P8  
                case "2":
                
                System.out.println(" ");
                System.out.println("Usted a seleccionado el Huawey P8 ");
                System.out.println("Caracteristicas del movil " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");
                System.out.println(" ");
                
                System.out.println("Ingrese el operador que desea adquirir : ");
                System.out.println(" ");
                System.out.println("1.Claro ");
                System.out.println("2.Movistar ");
                System.out.println("3.Entel ");
                
                a=modelos.nextLine();
                int P=Integer.parseInt(a);
                
                //casos para el tipo de operador movil
                
                    switch (a){
                        case "1":
                            //operadora movil Claro
                            System.out.println(" ");
                            System.out.println("Elegiste la operadora movil Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 10 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            e=modelos.next();
                            int E=Integer.parseInt(e);
                            
                           
                            
                            switch  (e){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/99.");
                                    
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 149 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 8 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/149.");
                                    break;
                            
                            
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan 189 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 9 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    
                                    System.out.println("El monto mensual a pagar es de S/189.");
                                   break;
                                 }
                                    break;
                                                                 
                            
                        //Operadora movil movistar    
                            
                        case "2":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la operadora movil Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan 199");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan 299");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            f=modelos.next();
                            int F=Integer.parseInt(f);
                    
                           
                           
                            switch  (f){
                                case "1":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 6 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/99.");
                                    break;
                                    
                                case "2":
                                    System.out.println("");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 199 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 14 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/199.");
                                    break;
                                    
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan  299 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 24 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/299.");
                                    
                                    break;
                                    
                                    }
                            
                                 break;
                            //operadora movil entel
                            case "3":
                            
                                System.out.println(" ");
                                System.out.println("Elegiste la operadora movil Entel ");
                                System.out.println("Elije un plan para tu equipo : ");
                            
                                System.out.println("1.FunPack 109");
                                System.out.println(" -Precio S/ 109 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 4 GB");
                                System.out.println(" -SMS Ilimitados");
                        
                                System.out.println("  ");
                                System.out.println("2.FunPack 119");
                                System.out.println(" -Precio S/ 119 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 7 GB");
                                System.out.println(" -SMS Ilimitados");
                            
                                System.out.println("  ");
                                System.out.println("3.FunPack 155");
                                System.out.println(" -Precio S/ 155 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 12 GB");
                                System.out.println(" -SMS Ilimitados");
                           
                            g=modelos.next();
                            int N=Integer.parseInt(g);
                            
                           
                            
                            switch (g){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/109.");
                                    
                                    break;
                                case "2":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 119 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/119"); 
                                    
                                    break;
                                 
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el Huawey P8");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a mensual a pagar es de S/155.");  
                                    break;
                            }
                    }
                    break;
                //Caso para la compra del telefono movil iPhone 6    
                case "3":
                
                System.out.println(" ");
                System.out.println("Usted a seleccionado el iPhone 6 ");
                System.out.println("Caracteristicas del movil " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");
                System.out.println(" ");
                
                System.out.println("Ingrese el operador que desea adquirir : ");
                System.out.println(" ");
                System.out.println("1.Claro ");
                System.out.println("2.Movistar ");
                System.out.println("3.Entel ");
                
                a=modelos.nextLine();
                int M=Integer.parseInt(a);
                
                    switch (a){
                        case "1":
                            //operadora movil Claro
                            System.out.println(" ");
                            System.out.println("Elegiste la operadora movil Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 10 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            e=modelos.next();
                            int E=Integer.parseInt(e);
                            
                            
                            switch  (e){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/99.");
                                    
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 149 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 9 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/149.");
                                    break;
                            
                            
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan 189 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 10 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    
                                    System.out.println("El monto mensual a pagar es de S/189.");
                                   break;
                                 }
                                    break;
                                                                 
                            
                            
                            
                        case "2":
                            //operadora movil Movistar
                            System.out.println(" ");
                            System.out.println("Elegiste la operadora movil Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan 199");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan 299");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            f=modelos.next();
                            int F=Integer.parseInt(f);
                    
                             
                            switch  (f){
                                case "1":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 6 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/99.");
                                    break;
                                    
                                case "2":
                                    System.out.println("");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 199 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 14 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/199.");
                                    break;
                                    
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 299 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 24 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/299.");
                                    
                                    break;
                                    
                                    }
                            
                                 break;
                            
                            case "3":
                            //operadora movil Entel
                                System.out.println(" ");
                                System.out.println("Elegiste la operadora movil Entel ");
                                System.out.println("Elije un plan para tu equipo : ");
                            
                                System.out.println("1.FunPack 109");
                                System.out.println(" -Precio S/ 109 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 4 GB");
                                System.out.println(" -SMS Ilimitados");
                        
                                System.out.println("  ");
                                System.out.println("2.FunPack 119");
                                System.out.println(" -Precio S/ 119 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 7 GB");
                                System.out.println(" -SMS Ilimitados");
                            
                                System.out.println("  ");
                                System.out.println("3.FunPack 155");
                                System.out.println(" -Precio S/ 155 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 12 GB");
                                System.out.println(" -SMS Ilimitados");
                           
                            g=modelos.next();
                            int N=Integer.parseInt(g);
                            
                            switch (g){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/109.");
                                    
                                    break;
                                case "2":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 119 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a mensual a pagar es de S/119."); 
                                    
                                    break;
                                 
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Usted adquirio el iPhone 6");
                                    System.out.println("Caracteristicas del movil: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto mensual a pagar es de S/155.");  
                                    break;
                            }
                    }
                    break;
                    }
        }
    }
