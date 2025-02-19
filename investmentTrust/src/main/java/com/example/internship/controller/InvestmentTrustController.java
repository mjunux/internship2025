package com.example.internship.controller;

import com.example.internship.entity.InvestmentTrustForm;
import com.example.internship.service.OrderInvestmentTrustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class InvestmentTrustController {

    @Autowired
    private OrderInvestmentTrustService orderInvestmentTrustService;

    @GetMapping("/investmentTrust")
    public String bankTransfer(Model model) {
        String[] bankNameOptions = {"金融機関を選択してください","Bank1","Bank2","Bank3"};
        String[] bankAccountOptions = {"科目名を選択してください","普通","定期","当座","貯蓄"};
        String[] fundNameOptions = {"銘柄を選択してください","fundA","fundB","fundC"};

        model.addAttribute("investmentTrustApplication", new InvestmentTrustForm());
        model.addAttribute("bankNameOptions", bankNameOptions);
        model.addAttribute("bankAccountOptions", bankAccountOptions);
        model.addAttribute("fundNameOptions", fundNameOptions);


        return "investmentTrustMain";
    }

    @PostMapping("/investmentTrustConfirmation")
    public String confirmation(@ModelAttribute InvestmentTrustForm investmentTrustForm, Model model) {
        model.addAttribute("bankName", investmentTrustForm.getBankName());
        model.addAttribute("branchName", investmentTrustForm.getBranchName());
        model.addAttribute("bankAccountType", investmentTrustForm.getBankAccountType());
        model.addAttribute("bankAccountNum", investmentTrustForm.getBankAccountNum());

        model.addAttribute("name", investmentTrustForm.getName());
        model.addAttribute("fundName", investmentTrustForm.getFundName());
        model.addAttribute("money", investmentTrustForm.getMoney());

        model.addAttribute("investmentTrustApplication", investmentTrustForm);
        return "investmentTrustConfirmation";
    }

    @PostMapping("/investmentTrustCompletion")
    public String completion(@ModelAttribute InvestmentTrustForm investmentTrustForm, Model model) {
        System.out.println(investmentTrustForm.getName());
        System.out.println(investmentTrustForm.getFundName());
        System.out.println(investmentTrustForm.getMoney());
        model.addAttribute("investmentTrustApplication", investmentTrustForm);
        orderInvestmentTrustService.orderInvestmentTrust(investmentTrustForm);
        return "investmentTrustCompletion";
    }

}
