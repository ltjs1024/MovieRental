package com.stone.movie;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 测试类
 */
public class CustomerTest {

    private static String squirrelStatement;
    private static String peterStatement;
    private static String stoneStatement;
    private static String xiaohuaStatement;

    @BeforeClass
    public static void setupBeforeClass() throws Exception {
        squirrelStatement = readFile("Squirrel.txt");
        peterStatement = readFile("Peter.txt");
        stoneStatement = readFile("Stone.txt");
        xiaohuaStatement = readFile("Xiaohua.txt");

    }

    public static String readFile(String filePath) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    @AfterClass
    public static void setupAfterClass() throws Exception {

    }


    /**
     * Method: statement()
     */
    @Test
    public void testStatement() throws Exception {
        Customer squirrel = new Customer("Squirrel");
        Rental rental = new Rental(new Movie("战狼II", Movie.NEW_RELEASE), 5);
        squirrel.addRental(rental);
        Assert.assertEquals(squirrelStatement, squirrel.statement());


        Customer xiaohua = new Customer("Xiaohua");
        Rental rental22 = new Rental(new Movie("战狼II", Movie.NEW_RELEASE), 2);
        Rental rental33 = new Rental(new Movie("三生三世", Movie.NEW_RELEASE), 3);
        Rental rental44 = new Rental(new Movie("功夫熊猫II", Movie.CHILDRENS), 3);
        xiaohua.addRental(rental22);
        xiaohua.addRental(rental33);
        xiaohua.addRental(rental44);
        Assert.assertEquals(xiaohuaStatement, xiaohua.statement());


        Customer peter = new Customer("Peter");
        Rental rental1 = new Rental(new Movie("战狼", Movie.REGULAR), 3);
        Rental rental2 = new Rental(new Movie("战狼II", Movie.NEW_RELEASE), 2);
        Rental rental3 = new Rental(new Movie("功夫熊猫", Movie.CHILDRENS), 5);
        peter.addRental(rental1);
        peter.addRental(rental2);
        peter.addRental(rental3);
        Assert.assertEquals(peterStatement, peter.statement());


        Customer stone = new Customer("Stone");
        Rental rental11 = new Rental(new Movie("黑客帝国", Movie.REGULAR), 7);
        Rental rental21 = new Rental(new Movie("战狼II", Movie.NEW_RELEASE), 5);
        Rental rental31 = new Rental(new Movie("功夫熊猫", Movie.CHILDRENS), 5);
        Rental rental41 = new Rental(new Movie("冰雪奇缘", Movie.CHILDRENS), 3);
        Rental rental51 = new Rental(new Movie("三生三世", Movie.NEW_RELEASE), 1);
        stone.addRental(rental11);
        stone.addRental(rental21);
        stone.addRental(rental31);
        stone.addRental(rental41);
        stone.addRental(rental51);
        Assert.assertEquals(stoneStatement, stone.statement());


    }


} 
