package java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddDays {

	public static void main(String[] args) {
		try {
			if (args.length != 2) {
				System.out.println("Please enter Date and No.of.days");
				return;
			}

			String dateString = args[0];
			int daysToAdd = Integer.parseInt(args[1]);


			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate inputDate = LocalDate.parse(dateString, formatter);


			LocalDate resultDate = inputDate.plusDays(daysToAdd);

			String resultDateString = resultDate.format(formatter);
			System.out.println("Input Date: " + dateString);
			System.out.println("Days to Add: " + daysToAdd);
			System.out.println("Result Date: " + resultDateString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


