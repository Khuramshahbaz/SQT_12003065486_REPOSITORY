import org.junit.Test;

import junit.framework.TestCase;

//package mera.l;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import junit.framework.TestCase;


/**
 *
 * @author SyedZeshan
 */
public class NewEmptyJUnitTest extends TestCase {
    
    @Test
    void testNotNull()
    {
        int a=10;
        int b=10;
        
        assertTrue(a==b);
        
        //assertNotNull();
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
