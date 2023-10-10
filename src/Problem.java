import java.util.Scanner;
import java.util.Locale;


public class Problem {
    public static void main(String[] args) throws Exception {     
     Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
     try{

        System.out.println("================== Jokêmpo ================================");
        System.out.println("================== Digite A para Ataque aéreo =========================");
        System.out.println("================== Digite B para Pedra ================================");
        System.out.println("================== Digite C para Papel ================================");
        System.out.println("================== Pressione 0 para começar ===========================");
        String jogadores = leitor.next();

        System.out.println("Jogador 1 digite sua jogada: ");
        System.out.println("                               ");
        String jogador1 = leitor.next();
        ;
        System.out.println("Jogador 2 digite sua jogada: ");
        System.out.println("                               ");
        String jogador2 = leitor.next();
        
        String jogada = jogador1 + jogador2;
        jogada = jogada.toUpperCase();
        

        switch(jogada){
            case "AB":{
                System.out.println("Jogador 1 venceu");
                break;
            }
             case "CB":{
                System.out.println("Jogador 1 venceu");
                break;
            }
             case "CA":{
                System.out.println("Jogador 1 venceu");
                break;
            }
             case "CC":{
                System.out.println("Jogador 1 venceu");
                break;
            }
             case "BB":{
                System.out.println("Sem ganhador");
                break;
            }
             case "AA":{
                System.out.println("Jogador 1 venceu");
                break;      

               
            }
        }








        }


    
    
     finally{
        leitor.close();
    }  
          
        
     
    }}
   