package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {

        ///injector is of type athleteCreationInjector
        ///create a variable one AthleteCreationInjector(class)for injector
        ///one for the type of processor(class) app
        AthleteCreationInjector injector;
        Processor app;

        ///print blank lines if you want

        // Create a Track Athlete

        ///taking the injector we created above and assigning it to each individual athletecreationinjector()
        ////creating a new object from the Injector (on  line 11)
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete

        ///taking the injector we created above and assigning it to each individual athletecreationinjector()
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        // Create a Rugby Athlete

        ///taking the injector we created above and assigning it to each individual athletecreationinjector()
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete

        ///taking the injector we created above and assigning it to each individual athletecreationinjector()
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

    }
}
