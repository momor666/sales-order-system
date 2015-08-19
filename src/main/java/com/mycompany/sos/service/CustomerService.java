/**
 * 
 */
package com.mycompany.sos.service;

import java.util.List;

import com.mycompany.sos.model.Customer;

/**
 * CustomerService interface
 * 
 * @author colin
 *
 */
public interface CustomerService {

	/**
	 * Adds a customer to the system
	 * <p> 
	 * This makes an underlying call to insert into the database
	 * 
	 * @param customer the customer to add
	 * @return true if successful false otherwise
	 */
	boolean addCustomer(Customer customer);
	
	/**
	 * Gets a list of customers
	 * 
	 * @return a list of customers
	 */
	List<Customer> getCustomers();
}
