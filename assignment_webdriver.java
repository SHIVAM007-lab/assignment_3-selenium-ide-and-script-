package Assignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class assignment_webdriver {

public static void main(String[] args) throws InterruptedException {
		
	// Taking 3 number from the user and Find the Greatest Number
			/*
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number 1:");
			int a = sc.nextInt();
			System.out.println("Enter a Number 2:");
			int b = sc.nextInt();
			System.out.println("Enter a Number 3:");
			int c = sc.nextInt();
			
			if(a>b && a>c) 
			{
				System.out.println("Fist is the greatest Number");
			}
			else if(b>a && b>c)
			{
				System.out.println("Second is the greatest Number");
			}
			else
			{
				System.out.println("Third is the greatest Number");
			}
			
			
			//print first 10 natural number by using while loop
			
			int i=1;
			while(i<=10)
			{
				System.out.println(i);
				i++;
			}
			
			
			// find the factorial Number for given number
			
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Enter a Number:");
					int num=sc.nextInt();
					int number=5;
					long factorial=1;
					
					for(int j=1;j<=number;j++)
					{
						factorial=factorial*j;
					}
					System.out.println("factorial of a number is :" + factorial);
		
					
					//to sum value of an array
					int a1[] = {10,20,30,40,50,60,70,80,90};
					int sum = 0;
					for(int k = 0;i<a1.length;i++)
					{
						sum = sum+a1[k];
					}
					{
						System.out.println("Sum of all the elements of an array :"+sum);
					}
					
					//WAP to calculate the average value of array elements. 
					
					int a2[] = {5,10,15,20,30,40,50};
					int sum1 = 0;
					for(int l= 0;i<a2.length;i++)
					{
						sum1 = sum1+a2[l];
					}
					{
						System.out.println("Average value of an array elements is :"+sum / a2.length);
					}
					*/
					//find the index of an array element
					
					//int a []= {3,5,6,2,8,9,1};
					//System.out.println();
					
					
					//find the minimum and maximum value of an array
					
					//int a [] = {100,200,300,50,10,500};				
					
					
					
					//to be check given number  is prime or not
					/*
					int num = 5;
					int count = 0;
					
					for(int i =1;i<=num;i++)
					{
						if(num % i==0)
						{
							count++;
						}
					}
					
					if(count==2)
					{
						System.out.println("prime number");
					}
					else
					{
						System.out.println("not prime number");
					}
					*/
			
			// given number is Armstrong or not
			/*
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int sum = 0;
			
			while(num>0) 
			{
				sum = sum +(num%10)*(num%10)*(num%10);
				num = num/10;
			}
			if(sum==num)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not Armstrong");
			}
			*/
			
			//create a Fibonacci Series
			
			/*
			int n1=0, n2=1, sum=0;
			System.out.print(n1+" "+n2);
			for(int i=2;i<10;i++)
			{
				sum=n1+n2;
				System.out.print(" "+sum);
				n1=n2;
				n2=sum;
			
			}
			*/
							
			}		
//Taking 3 number from the user and Find the Greatest Number
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number 1:");
		int a = sc.nextInt();
		System.out.println("Enter a Number 2:");
		int b = sc.nextInt();
		System.out.println("Enter a Number 3:");
		int c = sc.nextInt();
		
		if(a>b && a>c) 
		{
			System.out.println("Fist is the greatest Number");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second is the greatest Number");
		}
		else
		{
			System.out.println("Third is the greatest Number");
		}
		
		
		//print first 10 natural number by using while loop
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		
		// find the factorial Number for given number
		
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter a Number:");
				int num=sc.nextInt();
				int number=5;
				long factorial=1;
				
				for(int j=1;j<=number;j++)
				{
					factorial=factorial*j;
				}
				System.out.println("factorial of a number is :" + factorial);
	
				
				//to sum value of an array
				int a1[] = {10,20,30,40,50,60,70,80,90};
				int sum = 0;
				for(int k = 0;i<a1.length;i++)
				{
					sum = sum+a1[k];
				}
				{
					System.out.println("Sum of all the elements of an array :"+sum);
				}
				
				//WAP to calculate the average value of array elements. 
				
				int a2[] = {5,10,15,20,30,40,50};
				int sum1 = 0;
				for(int l= 0;i<a2.length;i++)
				{
					sum1 = sum1+a2[l];
				}
				{
					System.out.println("Average value of an array elements is :"+sum / a2.length);
				}
				*/
				//find the index of an array element
				
				//int a []= {3,5,6,2,8,9,1};
				//System.out.println();
				
				
				//find the minimum and maximum value of an array
				
				//int a [] = {100,200,300,50,10,500};				
				
				
				
				//to be check given number  is prime or not
				/*
				int num = 5;
				int count = 0;
				
				for(int i =1;i<=num;i++)
				{
					if(num % i==0)
					{
						count++;
					}
				}
				
				if(count==2)
				{
					System.out.println("prime number");
				}
				else
				{
					System.out.println("not prime number");
				}
				*/
		
		// given number is Armstrong or not
		/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) 
		{
			sum = sum +(num%10)*(num%10)*(num%10);
			num = num/10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		*/
		
		//create a Fibonacci Series
		
		/*
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		
		}
		*/
		
//WAP to create one thread by implementing Runnable interface in class.
		/*
		t1 obj1 = new t1(); 
      Thread t = new Thread(obj1); 
      t.start();
		
		*/

		//WAP to iterate through all elements in an array list
		/*
		ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  for (String element : list_Strings) {
		    System.out.println(element);
		  }
		  */
		
		//WAP to update specific array element by given element.
		
		/*
		ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Update the third element with "Yellow"
		  list_Strings.set(2, "Yellow");
		   // Print the list again
		  System.out.println(list_Strings);
		*/
		
		
		//WAP to remove the third element from a array list.
		
		/*
		ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Remove the third element from the list.
		  list_Strings.remove(2);
		  // Print the list again
		  System.out.println("After removing third element from the list:\n"+list_Strings);
		*/
		
		
		//WAP to Copy one array into another
		
		/*
		 int [] arr1 = new int [] {1, 2, 3, 4, 5};     
       //Create another array arr2 with size of arr1    
      int arr2[] = new int[arr1.length];    
      //Copying all elements of one array into another    
      for (int i = 0; i < arr1.length; i++) {     
          arr2[i] = arr1[i];     
      }      
       //Displaying elements of array arr1     
      System.out.println("Elements of original array: ");    
      for (int i = 0; i < arr1.length; i++) {     
         System.out.print(arr1[i] + " ");    
      }     
          
      System.out.println();    
          
      //Displaying elements of array arr2     
      System.out.println("Elements of new array: ");    
      for (int i = 0; i < arr2.length; i++) {     
         System.out.print(arr2[i] + " ");    
      }
      */
		
		//WAP to reverse an array of integer values. 
		
		/*
		int [] arr = new int [] {1, 2, 3, 4, 5};  
      System.out.println("Original array: ");  
      for (int i = 0; i < arr.length; i++) {  
          System.out.print(arr[i] + " ");  
      }  
      System.out.println();  
      System.out.println("Array in reverse order: ");  
      //Loop through the array in reverse order  
      for (int i = arr.length-1; i >= 0; i--) {  
          System.out.print(arr[i] + " ");  
      }  
      */
	
/*
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
*/

/*
Scanner scanner = new Scanner(System.in);
System.out.print("Enter n: ");
int n = scanner.nextInt();
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }
    System.out.println();
}
*/

/*
Scanner sc = new Scanner(System.in);

//Taking rows value from the user

System.out.println("How many rows you want in this pattern?");

int rows = sc.nextInt();

System.out.println("Here is your pattern....!!!"); 

for (int i = 1; i <= rows; i++)
{
    //Printing rows-i spaces at the beginning of each row

    for (int j = 1; j <= rows-i; j++)
    {
        System.out.print(" ");
    }

    //Printing 1 to i value at the end of each row

    for (int j = 1; j <= i; j++)
    {
        System.out.print(j+" ");
    }

    System.out.println();
}
*/

{
     int row, i, j, space = 1;  
     System.out.print("Enter the number of rows you want to print: ");  
     Scanner sc = new Scanner(System.in);  
     row = sc.nextInt();  
     space = row - 1;  
     for (j = 1; j<= row; j++)  
     {  
     for (i = 1; i<= space; i++)  
     {  
     System.out.print(" ");  
     }  
     space--;  
     for (i = 1; i <= 2 * j - 1; i++)  
     {  
     System.out.print("*");  
     }  
     System.out.println("");  
     }  
     space = 1;  
     for (j = 1; j<= row - 1; j++)  
     {  
     for (i = 1; i<= space; i++)  
     {  
     System.out.print(" ");  
     }  
     space++;  
    for (i = 1; i<= 2 * (row - j) - 1; i++)  
    {  
    System.out.print("*");  
    }  
    System.out.println("");  
    }  
  

	}

}
