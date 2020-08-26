package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester( Person thePerson  /* Person person */) {
        String manchester = "Manchester";

        if ( thePerson.getCity().equals(manchester) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean canWatchFilm( Person thePerson, int ageLimit       /* Person person, int ageLimit*/) {
        if ( thePerson.getAge() >= ageLimit )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}