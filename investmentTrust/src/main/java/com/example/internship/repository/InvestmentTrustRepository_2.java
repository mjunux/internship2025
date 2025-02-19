package com.example.internship.repository;

import com.example.internship.entity.InvestmentTrustForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InvestmentTrustRepository_2 {
    @Autowired
    JdbcTemplate jdbcTemplate_2;

    public void create(InvestmentTrustForm investmentTrustForm) {
        String sql = "INSERT INTO investmentTrust_table_2(bankName, branchName, bankAccountType, bankAccountNum, name, fundName, money) VALUES(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate_2.update(sql, investmentTrustForm.getBankName(),
                                investmentTrustForm.getBranchName(),
                                investmentTrustForm.getBankAccountType(),
                                investmentTrustForm.getBankAccountNum(),
                                investmentTrustForm.getName(),
                                investmentTrustForm.getFundName(),
                                investmentTrustForm.getMoney());
    }
}
