/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Washim_Akram
 */
public class BankNGTest {
    
    public BankNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of main method, of class Bank.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bank.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OpenAccount method, of class Bank.
     */
    @Test
    public void testOpenAccount() {
        System.out.println("OpenAccount");
        String account_type = "";
        int accnm = 0;
        Bank instance = new Bank();
        instance.OpenAccount(account_type, accnm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CloseAccount method, of class Bank.
     */
    @Test
    public void testCloseAccount() {
        System.out.println("CloseAccount");
        Bank instance = new Bank();
        instance.CloseAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Bank.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Bank instance = new Bank();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
