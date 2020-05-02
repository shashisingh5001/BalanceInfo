package com.bank.BalanceInfo.balancecustomer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Balance")
public class Balance {

    @Id
    @Column(name="Id")
    @GeneratedValue
    private int id;

    @Column(name="Account_No")
    private String acc;

    @Column(name="balance")
    private int bal;
}
