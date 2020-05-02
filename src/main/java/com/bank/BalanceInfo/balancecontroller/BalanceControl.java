package com.bank.BalanceInfo.balancecontroller;

import com.bank.BalanceInfo.balancecustomer.Balance;
import com.bank.BalanceInfo.balanceservice.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class BalanceControl {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("/balance")
    public List<Balance> getBalance(){

        return balanceService.getBal();
    }

    @PostMapping("/save")
    public ResponseEntity<String>saveCustomer(@Valid@RequestBody Balance balance){
         balanceService.saveAll(balance);

         return null;

    }


}
