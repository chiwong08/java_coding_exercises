package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double res = originalPrice * (1 + (vatRate/100));
        BigDecimal bigDecimal = new BigDecimal(res);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int listSize = users.size();
        int numLinuxUsers = 0;

        for ( int i = 1; i < listSize; i++ )
        {
            String linux = "Linux";
            User aUser = users.get(i);
            String theType = aUser.getType();

            if ( linux.equals(theType) )
            {
                numLinuxUsers++;
            }
        }
        return numLinuxUsers;
    }
}
