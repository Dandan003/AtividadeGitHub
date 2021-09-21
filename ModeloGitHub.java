
package Times;

import java.util.Scanner;


public class ModeloGitHub {
    public static void main(String[] args) {
        
        // Comparando o desempenho de dois times de futebol em uma partida.
        
        int flamengo;
        int vasco;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos gols o Flamengo fez?");
        flamengo = ler.nextInt();
        
        System.out.println("Quantos gols o Vasco fez?");
        vasco= ler.nextInt();
        if(flamengo>vasco){
            System.out.println("Flamengo campeão !!!");
        }else if(vasco>flamengo){
            System.out.println("Vasco campeão !!");
        } else{
                System.out.println("EMPATE.");
                }
                    
        
       
                
    }
    
}
