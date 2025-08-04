package assignment4;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int choice = Integer.parseInt(sc.nextLine());  // 1, 2 or 3
	        int hours = Integer.parseInt(sc.nextLine());
	        double costPerHour = Double.parseDouble(sc.nextLine());

	        Airfare airfare = null;

	        if (choice == 1) {
	            airfare = new AirIndia(hours, costPerHour);
	        } else if (choice == 2) {
	            airfare = new KingFisher(hours, costPerHour);
	        } else if (choice == 3) {
	            airfare = new Indigo(hours, costPerHour);
	        } else {
	            System.out.println("Invalid Choice");
	            System.exit(0);
	        }

	        // Round and print amount
	        System.out.printf("%.2f\n", airfare.calculateAmount());

	        sc.close();
	    }
	}




