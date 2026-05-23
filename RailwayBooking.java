package ProjectPractce2;

import java.util.Scanner;

public class RailwayBooking {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] seats = new int[20]; // 0 = available, 1 = booked
	        int choice;

	        do {
	            System.out.println("\n=== Railway Ticket Booking System ===");
	            System.out.println("1. Book Seat");
	            System.out.println("2. Cancel Seat");
	            System.out.println("3. View Seats");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter seat number to book (1-20): ");
	                    int bookSeat = sc.nextInt();
	                    if (bookSeat >= 1 && bookSeat <= 20) {
	                        if (seats[bookSeat - 1] == 0) {
	                            seats[bookSeat - 1] = 1;
	                            System.out.println("Seat " + bookSeat + " booked successfully!");
	                        } else {
	                            System.out.println("Seat already booked!");
	                        }
	                    } else {
	                        System.out.println("Invalid seat number!");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter seat number to cancel (1-20): ");
	                    int cancelSeat = sc.nextInt();
	                    if (cancelSeat >= 1 && cancelSeat <= 20) {
	                        if (seats[cancelSeat - 1] == 1) {
	                            seats[cancelSeat - 1] = 0;
	                            System.out.println("Seat " + cancelSeat + " cancelled successfully!");
	                        } else {
	                            System.out.println("Seat not booked!");
	                        }
	                    } else {
	                        System.out.println("Invalid seat number!");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Seat Status (0 = Available, 1 = Booked):");
	                    for (int i = 0; i < seats.length; i++) {
	                        System.out.println("Seat " + (i + 1) + ": " + seats[i]);
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank you for using Railway Booking System!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	              }
	        } while (choice!=4);
	}
}

	

