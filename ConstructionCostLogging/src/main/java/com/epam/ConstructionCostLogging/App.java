package com.epam.ConstructionCostLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
       double no_of_square_feet;
       int choice;
       Scanner sc=new Scanner(System.in);
       LOGGER.info("Enter Area of house in square Feet\n");
       no_of_square_feet=sc.nextDouble();
       LOGGER.info("Enter the Material Standard");
       LOGGER.info("\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n");
       choice=sc.nextInt();
       ConstructionCost obj=new ConstructionCost(no_of_square_feet,choice);
       if(choice==1||choice==2||choice==3)
       {
    	   LOGGER.info("House construction cost is "+obj.houseConstructionCost(no_of_square_feet,choice)+"INR");
       }
       else
       {
    	   LOGGER.info("Invalid Input");
       }
    }
}
