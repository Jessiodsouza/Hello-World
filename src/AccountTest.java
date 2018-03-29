import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testGetAcnumber() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		//Account baccount=new Account(1612,"Jessio",1000);
		//assertEquals("Jessio",baccount.getName());
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAccount() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		Account baccount=new Account(1612,"Jessio",1000);
		int balance=baccount.getBalance();
		baccount.Deposit(3000);
		assertEquals(balance+3000,baccount.getBalance());
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDisplayAccountDetails() {
		//fail("Not yet implemented");
	}

	@Test
	public void testTransfer() {
		//fail("Not yet implemented");
	}

}
