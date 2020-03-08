package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.ModelException;

public class Program {
	

	/*public long duration() {
		private Date checkIn;

		private Date checkOut;

		long diff = checkOut.getTime() - checkIn.getTime();

		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		if (checkIn.before(now) || checkOut.before(now)) {

		}

		if (!checkOut.after(checkIn)) {

			

		}

	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int number;
			String holder;
			double initialBalance;
			double withdrawLimit;
			
			System.out.println("Enter account data ");
			System.out.print("Number: ");
			number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			holder = sc.nextLine();
			System.out.print("Initial balance: ");
			initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			withdrawLimit = sc.nextDouble();
			
			System.out.print("Enter amount for withdraw: ");
			new Account(number, holder, initialBalance, withdrawLimit).withdraw(sc.nextDouble());
		}  catch(ModelException r) {
			System.out.println("Withdraw error: " + r.getMessage());
		}  catch(RuntimeException r) {
			System.out.println("Don't know");
		} finally {
			sc.close();
		}
 		

	}

}
