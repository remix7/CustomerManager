package com.remix.service.impl;

import java.util.List;
import java.util.UUID;

import com.remix.dao.CustomerDao;
import com.remix.dao.impl.CustomerDaoImpl;
import com.remix.domain.Customer;
import com.remix.exception.IdIsNullException;
import com.remix.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao cd = new CustomerDaoImpl();
	public void addCustomer(Customer c) {
		c.setId(UUID.randomUUID().toString());
		cd.addCustomer(c);
	}

	public void delCustomerById(String customerId) {
		cd.delCustomerById(customerId);
	}

	public List<Customer> findAll() {
		return cd.findAll();
	}

	public Customer findCustomerById(String customerId) {
		return cd.findCustomerById(customerId);
	}

	public void updateCustomer(Customer c) throws IdIsNullException {
		cd.updateCustomer(c);
	}

}
