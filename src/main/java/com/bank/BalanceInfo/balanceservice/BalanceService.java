package com.bank.BalanceInfo.balanceservice;

import com.bank.BalanceInfo.balancecustomer.Balance;
import com.bank.BalanceInfo.balancerepository.BalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BalanceService {

    @Autowired
     private BalanceRepo balanceRepo;

      public List<Balance> getBal(){

          List<Balance> balanceList=new ArrayList<>();
           balanceRepo.findAll().forEach(balanceList::add);
            return balanceRepo.findAll();

     }

     public void saveAll(Balance balance)
     {
         balanceRepo.save(balance);
     }
}
