/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vježba.igra.pogađanja;
import java.util.*;
/**
 *
 * @author TOMISLAV
 */
public class VježbaIgraPogađanja {
    static int brojPogodaka = 0;
    final static int MAX_POKUSAJA = 7;
    static Scanner tas = new Scanner(System.in);
   
    public static void main(String[] args) {
        String ponovo;
        
        System.out.println("Ovo je igra pogađanja brojeva");
        System.out.println("Ja ću zamisliti broj između 1 i 100");
        
        do{
        prvaIgra();
        System.out.println("Želita li nastaviti igrati? (d/n)");
        ponovo = tas.next();
        }while(ponovo.equals("d"));
        
        System.out.println("Pohodili ste ");
        if(brojPogodaka == 1)
            System.out.print("jedanput");
        else
            System.out.print(brojPogodaka + " puta.");
    }
    public static void prvaIgra(){
        int zamisljeniBroj;
        int pokusaniBroj;
        int brojPokusaja;
        
        zamisljeniBroj = (int)(100 * Math.random()) + 1;
        brojPokusaja = 0;
        
        System.out.println("Zamislio sam broj između 1 i 100");
        System.out.println("Pokušajte ga pogoditi \n");
        
        for(;;){
        System.out.print("Pogoditi broj");
        pokusaniBroj = tas.nextInt();
        brojPokusaja++;
        
        if(zamisljeniBroj == pokusaniBroj){
            System.out.println("ČESTITAMO POGODILI STE BROJ!!!");
            brojPogodaka++;
            break;
            }
        else if(brojPokusaja == MAX_POKUSAJA){
            System.out.println("Žao mi je, nista pogodili iz " + MAX_POKUSAJA + " puta");
            System.out.print("Zamišljeni broj je ");
            System.out.println(zamisljeniBroj);
            break;
        }
        else if(pokusaniBroj > zamisljeniBroj)
            System.out.println("Zamisljo sam manji broj");
        else if(pokusaniBroj < zamisljeniBroj)
            System.out.println("Zamislio sam veći broj");
        else
            System.out.println("Ovaj slučaj nije moguć");
        }
        
    }
}
