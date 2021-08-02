package app;

import java.util.Scanner;

import classes.Pessoa;
import classes.Aeronave;

public class App{

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        Aeronave aero = new Aeronave("Etherno3000");
        Pessoa per = new Pessoa(aero);
        per.voar(100);
        System.out.print("\\nPiloto: Agora a esquerda podemos ver uma ilha.");
        System.out.print("Passageiros:Quando chegar no 300 nos avise!");
        per.voar(300);
        System.out.print("Piloto:Agora estamos no 300!!!");
        System.out.print("Passageiros:Já já vamos chegar no local");
        sc.close();
    }
}