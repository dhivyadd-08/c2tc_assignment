package assignment5;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] bookingDetails = sc.nextLine().split(",");
	        String stageEvent = bookingDetails[0];
	        String customer = bookingDetails[1];
	        int noOfSeats = Integer.parseInt(bookingDetails[2]);

	        TicketBooking ticket = new TicketBooking(stageEvent, customer, noOfSeats);

	        int paymentMode = Integer.parseInt(sc.nextLine());

	        // Print booking details
	        System.out.println("Stage event:" + ticket.getStageEvent());
	        System.out.println("Customer:" + ticket.getCustomer());
	        System.out.println("Number of seats:" + ticket.getNoOfSeats());

	        // Payment Handling
	        switch (paymentMode) {
	            case 1:
	                int cashAmount = Integer.parseInt(sc.nextLine());
	                ticket.makePayment(cashAmount);
	                break;
	            case 2:
	                int walletAmount = Integer.parseInt(sc.nextLine());
	                String walletNumber = sc.nextLine();
	                ticket.makePayment(walletAmount, walletNumber);
	                break;
	            case 3:
	                String holderName = sc.nextLine();
	                int cardAmount = Integer.parseInt(sc.nextLine());
	                String creditCardType = sc.nextLine();
	                String ccv = sc.nextLine();
	                ticket.makePayment(holderName, cardAmount, creditCardType, ccv);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}




