package nam;

import java.util.Scanner; 
 
public class Nam {

	public static void main(String[] args) {
Scanner Neim = new Scanner(System.in); 

String Name1, Name2, Name3; 

System.out.println("Geben Sie drei Namen ein");

System.out.println("Geben Sie der erste Name ein: ");
Name1 = Neim.nextLine(); 
System.out.println("Geben Sie der zweite Name ein: ");
Name2 = Neim.nextLine(); 
System.out.println("Geben Sie der dritte Name ein: ");
Name3 = Neim.nextLine(); 
 
if (Name1.compareTo(Name2)>0) {
	String Hilfe;
	Hilfe=Name1;
	Name1=Name2; 
	Name2=Hilfe;
}

if (Name2.compareTo(Name3)>0) {
String Hilfe;
Hilfe=Name2;
Name2=Name3; 
Name3=Hilfe; 
	}
	
if (Name3.compareTo(Name2)>0) {
	String Hilfe; 
	Hilfe=Name2;
	Name2=Name3;
	Name2=Hilfe; 
	
}
System.out.println(Name1+";"+Name2+","+Name3); 

	}


}
