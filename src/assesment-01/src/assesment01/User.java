package assesment01;
//1. Jelaskan konsep OOP (Inheritance, Polymorphism, Abstraction, Encapsulation) dengan bahasa sendiri
//- Inheritance adalah kemampuan sebuah Class untuk dapat mewariskan atribut dan method kepada class lain atau sub class dibawahnya.;
//- Polymorphism artinya banyak bentuk, atau penggunaan satu method dengan nama yang sama, polymorphism dapat dilakukan dengan menerapkan;
//    a. Overriding : berarti mendefinisikan method superclass dengan nama yang sama pada subclass ;
//    b. Overloading : Overloading artinya menerapkan method yang sama namun dengan parameter yang berbeda;
//- Abstraction adalah class yang tidak bisa di instatiate atau di buat object baru secara langsung, hanya bisa di inheritance
//- Encapsulation adalah sebuah metode untuk mengatur class agar atribut-atribut sensitive yang terdapat dalam sebuah class tidak dapat di
//  akses dari luar kecuali dengan memanggil method tertentu seperti Set atau Get method dari sebuah class. ada 3 aksesbilitas dalam Encapsulation yaitu:
//    a. public : properti dapat di akses dari manapun
//    b. private : properti hanya dapat di akses dari dalam class
//    c. protected : properti hanya dapat di akses dari dalam class atau class turunannya

import java.util.Scanner;
import encodeDecode.Main;

public class User {

	private String username = null;
	private String password = null;
	private String firstname = null;
	private String lastname = null;
	private String email = null;
	private String fullName = null;

	Scanner myObj = new Scanner(System.in);
	Main toEncrypt = new Main();

	public User() {
	}

	// Define all setter and getter methods for each member field.
	public String getUsername() {
		return username;
	}

	public void setUsername() {
		// Create a Scanner object
		System.out.print("Enter username: ");
		String userName = myObj.nextLine(); // Read user input
		System.out.println("Username is: " + userName + "\n"); // Output user inpu
		this.username = userName;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		System.out.print("Enter password: ");
		String pswd = myObj.nextLine(); // Read user input
		System.out.println("Password is : " + pswd + "\n"); // Output user input
		String ePass = pswd;
		Main.Encode(ePass);
		this.password = Main.Encode(ePass);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname() {
		System.out.print("Enter First Name: ");
		String fn = myObj.nextLine(); // Read user input
		System.out.println("First Name : " + fn + "\n"); // Output user inpu
		this.firstname = fn;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname() {
		System.out.print("Enter Last Name: ");
		String ln = myObj.nextLine(); // Read user input
		System.out.println("Last name : " + ln + "\n"); // Output user inpu
		this.lastname = ln;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName() {
		this.fullName = firstname + " " + lastname;
		System.out.println("full name : " + fullName + "\n");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		System.out.print("Enter email: ");
		String mail = myObj.nextLine(); // Read user input
		System.out.println("email is: " + mail + "\n"); // Output user input
		this.email = mail;
	}

	@Override
	public String toString() {
		return "<\n Username: " + username + "\n Password: " + password + "\n email: " + email + "\n Full Name: "
				+ fullName + "\n>";
	}

}
