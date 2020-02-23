package com.epam.logging;

public class Interest {
	double principle,time,rate_of_interest;
	Interest(double principle,double time,double rate_of_interest)
	{
		this.principle=principle;
		this.time=time;
		this.rate_of_interest=rate_of_interest;
	}
	public double compoundInterest(double principle,double time,double rate_of_interest)
    {
        double compound_interest=principle*(Math.pow((1+rate_of_interest),time));
        return compound_interest;
    }
    public double simpleInterest(double principle,double time,double rate_of_interest)
    {
       double simple_interest=(principle*time*rate_of_interest)/100;
       return simple_interest;
    }
}
