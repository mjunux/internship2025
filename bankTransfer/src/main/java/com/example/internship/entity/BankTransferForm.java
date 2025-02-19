package com.example.internship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankTransferForm {
    @NonNull
    private String BankName;
    @NonNull
    private String BranchName;
    @NonNull
    private String SubjectName;
    @NonNull
    private String BankAccountName;
    @NonNull
    private Integer BankAccountNum;
    @NonNull
    private Integer TransferAmount;
    @NonNull
    private String Date;




    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String BranchName) {
        this.BranchName = BranchName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        this.SubjectName = SubjectName;
    }
    public String getBankAccountName() {
        return BankAccountName;
    }

    public void setBankAccountName(String BankAccountName) {
        this.BankAccountName = BankAccountName;
    }

    public Integer getBankAccountNum() {
        return BankAccountNum;
    }

    public void setBankAccountNum(Integer BankAccountNum) {
        this.BankAccountNum = BankAccountNum;
    }

    public Integer getTransferAmount() {
        return TransferAmount;
    }

    public void setTransferAmount(Integer TransferAmount) {
      this.TransferAmount = TransferAmount;
    }

    public String Date() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
}