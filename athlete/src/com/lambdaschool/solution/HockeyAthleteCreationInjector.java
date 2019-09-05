package com.lambdaschool.solution;

//HockeyAthleteCreationInjector is of type AthleteCreationInjector
public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{

    ///line 9 is a return type of method processor and we assign it to app  in main
    ///identify the type process from the getProcess() in main
    //getProcess  returns object of type processor

    //MyApplication is of type processor
     @Override
    public Processor getProcess()
    {
        return new MyApplication(new HockeyAthleteImpl());
    }
}
