package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.NumberCheck;

class NumberTest {
	static NumberCheck obj;
	static Logger log=Logger.getLogger("NumberCheck");
	@BeforeAll
	public static void init() {
		obj=new NumberCheck();
		//System.out.println("Object Created");
		log.info("Object Created");
		
	}
	@AfterAll
	public static  void destroy() {
		obj=null;
		log.info("Object Destroyed");
	}
	@Test
	void testEvenChek() {
		//NumberCheck obj=new NumberCheck();
		log.info("Testing Even Number");
		assertEquals("Even", obj.checkEvenOrOddNumber(10));
	}
	
	@Test
	void testOddChek() {
		//NumberCheck obj=new NumberCheck();
		log.info("Testing Odd Number");
		assertEquals("Odd", obj.checkEvenOrOddNumber(13));
	}
	
	@Test
	void testInvalidNumber() {
		//NumberCheck obj=new NumberCheck();
		log.info("Testing Invaid Number");
		assertEquals("Invaid Number", obj.checkEvenOrOddNumber(-13));
	}
	
	@Test
	public void testPrimeNumber() {
		log.info("Testing Prime Number");
		assertTrue(obj.isPrime(11));
		assertFalse(obj.isPrime(12));
		assertFalse(obj.isPrime(0));
	}
}
