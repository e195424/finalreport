package jp.ac.uryukyu.ie.e195424;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DamageCalcTest {
    @Test
    public void DamageTest(){
        int MaxExpected=60;
        DamageCalc DCtest = new DamageCalc(50,100,136,103);

        double c = DCtest.Com(); 
        int MaxResult = (int)Math.floor(c);

        System.out.println(MaxResult);

 
        assertEquals(MaxExpected, MaxResult);

    }


    
}    
