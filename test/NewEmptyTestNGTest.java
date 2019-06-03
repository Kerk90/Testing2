/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testing2.myCode.CalculatorImp;

/**
 *
 * @author user
 */
public class NewEmptyTestNGTest {
    
    private CalculatorImp calculator; 
    

    @BeforeClass
    public  void setUpClass() {
       calculator=new CalculatorImp();         
    }
 public NewEmptyTestNGTest(){
}
 @Test
 public void zeroTest() {
     double result = calculator.calculate("0");
     assertEquals(result,0.0 , " Oshibka! Test na null ne prohodit!" );
 }
   @Test
    public void FloatingPointTest() throws Exception {
        double result = calculator.calculate("-3000.02");
        assertEquals(result, -3000.02,  1e-9, "Oshibka! Test  ne prohodit!");
    }

    @Test
    public void addTest_1() throws Exception {
        double result = calculator.calculate("30.4/2");
        assertEquals(result, 15.2,  1e-9, "Oshibka! Test umnojenie  ne prohodit!");
    }

    @Test
    public void addTest_2() throws Exception {
        double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(result, -443.4,  1e-9, "Oshibka! Test na slojnie vichislenia   ne prohodit!");
    }

    @Test
    public void functionTest() throws Exception {
        double result = calculator.calculate("sin(1)*sin(1)+cos(1)*cos(1)");
        assertEquals(result, 1,  1e-9, "Oshibka! Test na function ne prohodit!");
    }
    
    @Test
    public void zeroDivision() throws Exception {
        double result = calculator.calculate("10/0");
        assertEquals(result, Infinity,  1e-9, "Oshibka! Test delenie na null ne prohodit!");
    }
}
