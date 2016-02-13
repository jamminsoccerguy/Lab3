package step1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */
public class RationalTest {

    @Test
    public void setRationalTest(){

        Rational ration = new Rational(2,5);

        ration.setRational();

        int expectedNumerator = 1, expectedDenomiator = 3;
        int actualNumerator = ration.getNumerator(), actualDenominator = ration.getDenominator();

        assertEquals(actualNumerator, expectedNumerator);
        assertEquals(actualDenominator, expectedDenomiator);

    }

   // @Test
    //public void addRationalTest(){

        //assertEquals(new Rational(3,4).addRational(new Rational(1,2)), new Rational(10,8));
    //}

}