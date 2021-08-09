package day2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Excep {


			public static void main(String[] args)  {
				
				
				Businessvalid b1=new Businessvalid();
			  			
					try {
						if(b1.isValidEmail("deshpanderamakrishna@gmail.in")) {
							System.out.println("eMAIL VALIDATED");
						}
					} catch (InvalidEmailException e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}
				
				
				try {
					if(b1.isValidPassword("QWERTYTUIOP")) {
						System.out.println("Password Validated");}
				} catch (InvalidPassException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
						try {
							if(b1.isValidAdhar("987733323278")) {
								System.out.println("Adhar Validated");}
						} catch (InvalidAdharException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					
				
			
					}
		

	

	}