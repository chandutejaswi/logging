package com.epam.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	double principle,time,rate_of_interest;
    	Scanner sc=new Scanner(System.in);
    	LOGGER.info("Enter principle amount:");
    	principle=sc.nextDouble();
    	LOGGER.info("Enter time period:");
    	time=sc.nextDouble();
    	LOGGER.info("Enter rate of interest:");
    	rate_of_interest=sc.nextDouble();
    	Interest obj=new Interest(principle,time,rate_of_interest);
    	int option;
        LOGGER.info("\n1.Simple Interest\n2.Compound Interest\n");
    	LOGGER.info("Enter choice: ");
    	option=sc.nextInt();
    	if(option==1)
    	{
    		LOGGER.info("Simple Interest is {}",obj.simpleInterest(principle,time,rate_of_interest));
    	}
    	else if(option==2)
    	{
    		LOGGER.info("Compound Interest is {}",obj.compoundInterest(principle, time, rate_of_interest));
    	}
    	else
    	{
    		LOGGER.info("Invalid choice");
    	}
    }
}
