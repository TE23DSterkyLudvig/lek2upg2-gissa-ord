import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    

String[] rotfrukter = {"morot","palsternacka", "rotselleri"};
Scanner tb = new Scanner(System.in);
int rättSvar = 0;
String [] svar = new String[3];

System.out.println("Du ska gissa på 3 olika rotfrukter.");
System.out.println("Du får 3 gissningar");


for (int i = 0; i < rotfrukter.length; i++) {
    
System.out.print("gissa rotfrukt:");
String gissning = tb.nextLine();


if(gissning.equals(rotfrukter[0])){
    
    System.out.println("Rätt svar");
    rättSvar++;
    svar[0] = rotfrukter[0];
    
}
else if(gissning.equals(rotfrukter[1])){
    
    System.out.println("Rätt svar");
    rättSvar ++;
    svar[1] = rotfrukter[1];
    }

else if(gissning.equals(rotfrukter[2])){
    System.out.println("Rätt svar");
    rättSvar++;
    svar[2] = rotfrukter[2];
    }

}


System.out.println("Du fick " + rättSvar + " rätt av 3");

tb.close();

    }
}
