package com.lambdaschool.solution;

//myapplication if of type processor
//this is the filter for every message
//this applies the business rules
public class MyApplication implements Processor
{
    private AthleteService athleteSrv;

    public MyApplication(AthleteService athleteSrv)
    {
        this.athleteSrv=athleteSrv;
    }

    @Override
    public void displayAthlete() {
        System.out.println("********");
        athleteSrv.displayAthlete();
        System.out.println("********");
    }
}