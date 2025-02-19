package com.example.internship.service;

import com.example.internship.entity.InvestmentTrustForm;
import com.example.internship.repository.InvestmentTrustRepository;
import com.example.internship.repository.InvestmentTrustRepository_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderInvestmentTrustService {
    @Autowired
    private InvestmentTrustRepository investmentTrustRepository;
    @Autowired
    private InvestmentTrustRepository_2 investmentTrustRepository_2;

    public void orderInvestmentTrust(InvestmentTrustForm investmentTrustForm) {
        investmentTrustRepository.create(investmentTrustForm);
    }
    public void orderInvestmentTrust_2(InvestmentTrustForm investmentTrustForm) {
        investmentTrustRepository_2.create(investmentTrustForm);
    }
}
