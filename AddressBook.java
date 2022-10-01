package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<ContactPerson> list = new ArrayList<>();

		while (true) {
			System.out.println("Enter Choice: \n1. Add new User\n2. Edit user\n3. Delete User");
			int choice = sc.nextInt();

			if (choice == 1) {
				String first_name = sc.next();
				String last_name = sc.next();
				String address = sc.next();
				String city = sc.next();
				int zip = sc.nextInt();
				int phone = sc.nextInt();
				String email = sc.next();

				list.add(new ContactPerson(first_name, last_name, address, city, phone, zip, email));

			} else if (choice == 2) {
				System.out.println("Enter the user name to edit: ");
				String first_name = sc.next();

				System.out.println("New First Name: ");
				String edit_first_name = sc.next();

				System.out.println("New Last Name: ");
				String edit_last_name = sc.next();

				for (ContactPerson e : list) {
					if (e.first_name.equals(first_name)) {
						e.setFirst_name(edit_first_name);
						e.setLast_name(edit_last_name);
					}
				}

			} else if (choice == 3) {
				System.out.println("Deleting User");
				System.out.println("Enter the user name to delete: ");
				String delete_name = sc.next();

				for (ContactPerson e : list) {
					if (e.first_name.equals(delete_name)) {
						System.out.println("Deleting this user " + e.first_name);
						list.remove(e);
					}
				}

			} else {
				System.out.println("Wrong choice");
			}

			for (ContactPerson e : list) {
				System.out.println(e);
			}
			System.out.println();
		}

	}

}
