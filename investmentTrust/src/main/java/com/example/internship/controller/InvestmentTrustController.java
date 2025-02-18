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
        model.addAttribute("investmentTrustApplication", new InvestmentTrustForm());
        String[] nameOptions_0 = {"山陰共同銀行", "山陽共同銀行", "陰陽共同銀行"};
        String[] nameOptions_1 = {"りんご", "ぶどう", "みかん"};
        String[] nameOptions_2 = {"普通", "定期", "当座"};
        model.addAttribute("bankNames", nameOptions_0);
        model.addAttribute("blandNames", nameOptions_1);
        model.addAttribute("bankAccountTypes", nameOptions_2);
        model.addAttribute("investmentTrustApplication", new InvestmentTrustForm());
        return "investmentTrustMain";
    }

    @PostMapping("/investmentTrustConfirmation")
    public String confirmation(@ModelAttribute InvestmentTrustForm investmentTrustForm, Model model) {
        //investmentTrustForm.setBankName("ながれぼし銀行");
        model.addAttribute("bankName", investmentTrustForm.getBankName());
        model.addAttribute("bankAccountNum", investmentTrustForm.getBankAccountNum());
        //以下追加したもの
        model.addAttribute("branchName", investmentTrustForm.getBranchName());
        model.addAttribute("bankAccountType", investmentTrustForm.getBankAccountType());
        model.addAttribute("name", investmentTrustForm.getName());
        model.addAttribute("fundName", investmentTrustForm.getFundName());
        model.addAttribute("money", investmentTrustForm.getMoney());
        //
        model.addAttribute("investmentTrustApplication", investmentTrustForm);
        return "investmentTrustConfirmation";
    }

    @PostMapping("/investmentTrustCompletion")
    public String completion(@ModelAttribute InvestmentTrustForm investmentTrustForm, Model model) {
        orderInvestmentTrustService.orderInvestmentTrust(investmentTrustForm);
        return "investmentTrustCompletion";
    }

}
