package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 31, 1993);
	    assertEquals("2/1/1993", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1990);
	    assertEquals("3/4/1990", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 31, 1993);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 30, 2019);
	    assertEquals("12/1/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 29, 29);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, (-3461), 774);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 2007);
	    assertEquals("6/7/2007", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 2018);
	    assertEquals("10/11/2018", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 799);
	    String string0 = nextDate0.run(5, 10, 2001);
	    assertEquals("5/11/2001", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1990);
	    assertEquals("9/10/1990", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, (-3461), 774);
	    String string0 = nextDate0.run(4, 10, 2021);
	    assertEquals("4/11/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 31, 1954);
	    assertEquals("9/1/1954", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(4657, 2, 2021);
	    String string0 = nextDate0.run(12, 2, 2021);
	    assertEquals("12/3/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1891);
	    assertEquals("7/7/1891", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 1947);
	    assertEquals("1/1/1948", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1940);
	    assertEquals("2/29/1940", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2000);
	    assertEquals("2/3/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1959);
	    assertEquals("3/1/1959", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1900);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 30, 2014);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(1993, 11, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run((-449), 11, (-236));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 2083);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 4657, 28);
	    String string0 = nextDate0.run(1, 1, 111);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, (-1069), 310);
	    String string0 = nextDate0.run(1, 724, 1801);
	    assertEquals("invalid Input Date", string0);
	}

}