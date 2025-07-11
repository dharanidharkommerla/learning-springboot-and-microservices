package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	// saving account
	@RequestMapping(value="/bank/savingAccount")
	public String getSavingAccount() {
		return "<h2>You have reached to Saving Account section</h2>";
	}
	
	// current account
	@RequestMapping(value="/bank/currentAccount")
	public String getCurrentAccount() {
		return "<h2>You have reached to Current Account section</h2>";
	}
	
	// home loan
	@RequestMapping(value="/bank/homeLoan")
	public String getHomeLoan() {
		return "<h2>You have reached to Home Loan Section</h2>";
	}
	
	// personal loan
	@RequestMapping(value="/bank/personalLoan")
	public String getPersonalHomeLoan() {
		return "<h2>You have reached to Personal Loan Section</h2>";
	}
}
