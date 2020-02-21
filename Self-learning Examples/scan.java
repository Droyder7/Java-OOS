import java.util.Scanner;

class scan
{
    public static void main(String[] args) {

		try { 

			// Get the string 
			String s = "Scanner Class String"; 

			// create a new scanner 
			// with the specified String Object 
			Scanner scanner = new Scanner(s); 

			// print the next line of the string 
			System.out.println("Scanner: "
							+ scanner.nextLine()); 

			// close the scanner 
			scanner.close(); 

			// System.out.println("\nScanner Closed.\n"); 

			// System.out.println("Trying to use scanner"
			// 				+ " after closing."); 

			// // print the next line of the string 
			// System.out.println(scanner.nextLine());
			
			// Using Console to input data from user 
        //String name = System.console().readLine(); 
          
        System.out.println(" Read Line : " +System.console().readLine()); 
            
            Scanner in = new Scanner(System.in);

            System.out.println("Next Word : "+in.next());
           System.out.println("Next Int : "+in.nextInt());
            System.out.println("Next Line: " + in.nextLine());
            
            in.close();
		} 

		catch (Exception e) { 
			System.out.println("Exception thrown:\n" + e); 
		} 
	} 
}