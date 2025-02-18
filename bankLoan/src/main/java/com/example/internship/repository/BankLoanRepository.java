package com.example.internship.repository;

import com.example.internship.entity.BankLoanForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

/*
public class BankLoanRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(BankLoanForm bankLoanForm) {
        String sql = "INSERT INTO bankLoan_table(bankName, bankAccountNum, branchName, bankKinds, name, loanAmount, annualIncome, interestRate) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, bankLoanForm.getBankName(), bankLoanForm.getBankAccountNum(), bankLoanForm.getBranchName(), bankLoanForm.getBankKinds(), bankLoanForm.getName(), bankLoanForm.getLoanAmount(), bankLoanForm.getAnnualIncome(), bankLoanForm.getInterestRate()
        );
    }

}
*/

public class BankLoanRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(BankLoanForm bankLoanForm) {
        String sql = "INSERT INTO bankLoan_table(bankName, bankAccountNum, branchName, bankKinds, name, loanAmount, annualIncome, interestRate) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, bankLoanForm.getBankName(), bankLoanForm.getBankAccountNum(), bankLoanForm.getBranchName(), bankLoanForm.getBankKinds(), bankLoanForm.getName(), bankLoanForm.getLoanAmount(), bankLoanForm.getAnnualIncome(), bankLoanForm.getInterestRate()
        );
    }

}