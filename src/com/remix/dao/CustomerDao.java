package com.remix.dao;

import java.util.List;

import com.remix.domain.Customer;
import com.remix.exception.IdIsNullException;

public interface CustomerDao {
	/**
	 * 添加客户信息
	 * @param c
	 */
	void addCustomer(Customer c);
	/**
	 * 根据用户Id来删除用户
	 * @param customerId
	 */
	void delCustomerById(String customerId);
	/**
	 * 更新用户信息
	 * @param c
	 * @throws IdIsNullException 如果c的id为null 抛出异常
	 */
	void updateCustomer(Customer c)throws IdIsNullException;
	/**
	 * 查询所有用户的信息
	 * @return
	 */
	List<Customer> findAll();
	/**
	 * 根据Id查询客户信息
	 * @param customerId
	 * @return
	 */
	Customer findCustomerById(String customerId);
}
