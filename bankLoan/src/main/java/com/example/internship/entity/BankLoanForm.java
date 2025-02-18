package com.example.internship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankLoanForm {
    @NonNull
    private String bankName;
    @NonNull
    private Integer bankAccountNum;
    @NonNull
    private Integer branchName;
    @NonNull
    private String bankKinds;
    @NonNull
    private String name;
    @NonNull
    private Integer loanAmount;
    @NonNull
    private Integer annualIncome;
    @NonNull
    private Integer interestRate;


    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getBankAccountNum() {
        return bankAccountNum;
    }
    public void setBankAccountNum(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public Integer getBranchName() {
        return branchName;
    }
    public void setBranchName(Integer branchName) {
        this.branchName = branchName;
    }

    public String getBankKinds() {
        return bankKinds;
    }
    public void setBankKinds(String bankKinds) {
        this.bankKinds = bankKinds;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getAnnualIncome() {
        return annualIncome;
    }
    public void setAnnualIncome(Integer annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Integer getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }
}
