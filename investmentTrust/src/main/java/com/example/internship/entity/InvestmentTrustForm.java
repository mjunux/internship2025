package com.example.internship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentTrustForm {
    @NonNull
    private String bankName;
    @NonNull
    private Integer branchName;
    @NonNull
    private String bankAccountType;
    @NonNull
    private Integer bankAccountNum;
    @NonNull
    private String name;
    @NonNull
    private String fundName;
    @NonNull
    private Integer money;

    //金融機関名
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    //支店名
    public Integer getBranchName() {
        return branchName;
    }
    public void setBranchName(Integer branchName) {
        this.branchName = branchName;
    }

    //科目名
    public String getBankAccountType() {
        return bankAccountType;
    }
    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    //口座番号
    public Integer getBankAccountNum() {
        return bankAccountNum;
    }
    public void setBankAccountNum(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    //金融機関名
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //金融機関名
    public String getFundName() {
        return fundName;
    }
    public void setFundName(String fundName) {
        this.bankName = fundName;
    }

    //口座番号
    public Integer getMoney() {
        return money;
    }
    public void setMoney(Integer money) {
        this.money = money;
    }

}
