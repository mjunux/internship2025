package com.example.internship.controller;

import com.example.internship.entity.BankLoanForm;
import com.example.internship.service.ApplyBankLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
public class BankLoanController {

    @Autowired
    private ApplyBankLoanService applyBankLoanService;

    @GetMapping("/bankLoan")
    public String bankTransfer(Model model) {
        model.addAttribute("bankLoanApplication", new BankLoanForm());

        List<String> bankOptions = new ArrayList<>();
        bankOptions.add("藤井銀行");
        bankOptions.add("東京りんご銀行");
        bankOptions.add("魚動中央銀行");
        model.addAttribute("bankOptions",bankOptions);

        List<String> bankKindsOptions = new ArrayList<>();
        bankKindsOptions.add("普通預金");
        bankKindsOptions.add("総合預金");
        bankKindsOptions.add("当座預金");
        model.addAttribute("bankKindsOptions",bankKindsOptions);

        List<Integer> loanAmountOptions = new ArrayList<>();
        loanAmountOptions.add(100);
        loanAmountOptions.add(200);
        loanAmountOptions.add(300);
        loanAmountOptions.add(500);
        loanAmountOptions.add(1000);
        model.addAttribute("loanAmountOptionsNull", "");
        model.addAttribute("loanAmountOptions",loanAmountOptions);

        return "bankLoanMain";
    }

    @PostMapping("/bankLoanConfirmation")
    public String confirmation(@ModelAttribute BankLoanForm bankLoanForm, Model model) {
        model.addAttribute("bankName", bankLoanForm.getBankName());
        model.addAttribute("bankAccountNum", bankLoanForm.getBankAccountNum());
        model.addAttribute("interestRate", bankLoanForm.getInterestRate());
        model.addAttribute("bankLoanApplication", bankLoanForm);

        return "bankLoanConfirmation";
    }

    @PostMapping("/bankLoanCompletion")
    public String completion(@ModelAttribute BankLoanForm bankLoanForm, Model model) {
        applyBankLoanService.applyBankLoan(bankLoanForm);
        return "bankLoanCompletion";
    }

}
