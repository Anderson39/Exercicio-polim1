package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourceEmployee;

public class Programa {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee>list = new ArrayList<>();
		// vamos ler a quantidade de funcionário e guardar na variável "n"
		System.out.print("Enter the number of employees:  ");
		int n = sc.nextInt();
		// agora eu vou ter que ler uma quantidade "n" de funcionários e guardar em uma lista, pra isso e preciso criar uma lista.
		//List<Employee>Employee = new ArrayList<>();
		/* proximo passo é fazer um for para ler a quantidade de funcionário da minha lista*/
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #"+ i + "data:");
		    System.out.print("Outsourced (y/n)?");
		    char ch = sc.next().charAt(0);
		    System.out.print("Name: ");
		    //para funcionar meu nextLine é preciso dar uma quebra de linha pendente
		   sc.nextLine();
		    String name = sc.nextLine();
		    
		    System.out.print("Hours: ");
		    int hours = sc.nextInt();
		    System.out.print("Value per hour: ");
		    double valuePerHour = sc.nextDouble();
		    if (ch == 'y') {
		    	System.out.println("Additional charge: ");
		    	double additionalCharge = sc.nextDouble();
		    	//agora irei intanciar um novo funcionário e add em uma lista
		    	/*eu posso pegar a minha variavel "emp" e colocar dentro do "add"*/
          //Employee emp new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
		        list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
		    	
		    }
		    else {
		    	//Employee emp = new Employee(name, hours, valuePerHour);
		    	list.add(new Employee(name, hours, valuePerHour));
		    }
		    System.out.println();
		    System.out.println("PAYMENTS:");
		    for(Employee emp : list) {
		    	/* para cada funcionário "emp" na minha lista "list" eu vou manda imprimir na tela o nome do funcinario que é "emp.getName" concatenado
		    	 com " -$ " e concatenado com o pagamento desse funcionário que é " emp.payment"
		    	 */
		    	System.out.println(emp.getName()+ "- $ " + String.format("%.2f", emp.payment()));
		    }
		}
		sc.close();
	}

	}
