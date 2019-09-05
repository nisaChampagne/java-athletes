package com.lambdaschool.solution;


public class MyApplication implements Processor
{
    private AthleteService athleteSrv;

    public MyApplication(AthleteService athleteSrv)
    {
        this.athleteSrv=athleteSrv;
    }

    @Override
    public void displayAthlete(String athlete)
    {
        System.out.println("********");
        athleteSrv.displayAthlete(athlete);
        System.out.println("********");
    }
}