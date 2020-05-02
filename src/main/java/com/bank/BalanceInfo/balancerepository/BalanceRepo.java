package com.bank.BalanceInfo.balancerepository;

import com.bank.BalanceInfo.balancecustomer.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepo extends JpaRepository<Balance,Integer> {
}
