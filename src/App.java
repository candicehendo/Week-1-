
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Week 1 Coding Assignment
		//Creating two variables and assigning values to each
	
		double itemPrice1 = 100;
		double itemPrice2 = 45.50;
		
		float amountOfMoney1 = 200;
		float amountOfMoney2 = 400;
		
		int numberOfFriends1 = 100;
		int numberOfFriends2 = 75;
		
		double ageInYears1 = 20;
		double ageInYears2 = 30;
		
		String firstName1 = "Spongebob";
		String firstName2 = "Patrick";
				
		String lastName1 = "Squarepants";
		String lastName2 = "Starr";
		
		char middleInitial1 = 'A';
		char middleInitial2 = 'B';
		
	//Now creating variables using operations and concatenation
		//New amount of money in wallet after buying item
		//I have to substract the values in the amountOfMoney identifiers to itemPrice identifiers
		//to get the total new amount of money
		
		double newAmountOfMoney1 = amountOfMoney1 - itemPrice1;
		double newAmountOfMoney2 = amountOfMoney2 - itemPrice2;
		
		//Number of friends made each year based on age variable and number of friends variable
		//I will divide the number of friends to the number of age to get the number of 
		//how many friends have been  made each year since birth
		
		double numberOfFriendsMade1 = numberOfFriends1 / ageInYears1;
		double numberOfFriendsMade2 = numberOfFriends2 / ageInYears2;
		
		
		//Full name using concatenation and adding space in between the names
		String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
		String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
		
		//Using System.out.println() to print console
		System.out.println("The money I have left after shopping is $" +newAmountOfMoney1);
		System.out.println("Compared to the money my friend has, which is $" +newAmountOfMoney2 + ".");
		System.out.println("But at least I have made " +numberOfFriendsMade1 + " " + "friends each year since birth,");
		System.out.println("While he has only made " + numberOfFriendsMade2 + " friends each year.");
		System.out.println("By the way, my name is " + fullName1 + ".");
		System.out.println("My friend's name is " + fullName2 + ".");
	}

}
