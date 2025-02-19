package com.example.internship.controller;

import com.example.internship.entity.BankTransferForm;
import com.example.internship.service.ApplyBankTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BankTransferController {

    @Autowired
    private ApplyBankTransferService applyBankTransferService;

    @GetMapping("/bankTransfer")
    public String bankTransfer(Model model) {
        List<String> BankNameOptions = new ArrayList<>();
        BankNameOptions.add("松銀行");
        BankNameOptions.add("梅銀行");
        BankNameOptions.add("竹銀行");
        BankNameOptions.add("桜銀行");
        System.out.println(BankNameOptions);

        List<String>  BranchNameOptions = new ArrayList<>();
        BranchNameOptions.add("南支店");
        BranchNameOptions.add("西支店");
        BranchNameOptions.add("東支店");
        BranchNameOptions.add("北支店");
        System.out.println(BranchNameOptions);
        List<String>  SubjectNameOptions = new ArrayList<>();
        SubjectNameOptions.add("普通");
        SubjectNameOptions.add("当座");
        System.out.println(SubjectNameOptions);
        model.addAttribute("bankTransferApplication", new BankTransferForm());
        model.addAttribute("BankNameOptions", BankNameOptions);
        model.addAttribute("BranchNameOptions", BranchNameOptions);
        model.addAttribute("SubjectNameOptions",SubjectNameOptions);
        model.addAttribute("BankAccountNameOptions", "山田太郎");
        model.addAttribute("BankAccountNumOptions", "12345");
        model.addAttribute("TransferAmountOptions", "10000");
        model.addAttribute("DateOptions", "20250220");
        return "bankTransferMain";
    }
    @PostMapping("/bankTransferConfirmation")
    public String confirmation(@ModelAttribute BankTransferForm bankTransferForm, Model model) {
        bankTransferForm.setBankName("ながれぼし銀行");
        System.out.println(bankTransferForm.getBankName());
        System.out.println(bankTransferForm.getBranchName());
        System.out.println( bankTransferForm.getSubjectName());
        System.out.println( bankTransferForm.getBankAccountNum());
        System.out.println(bankTransferForm.getBankAccountName());
        System.out.println(bankTransferForm.getDate());
        System.out.println(bankTransferForm.getTransferAmount());
        model.addAttribute("BankName", bankTransferForm.getBankName());
        model.addAttribute("BranchName", bankTransferForm.getBranchName());
//        model.addAttribute("SubjectName", bankTransferForm.getSubjectName());
        model.addAttribute("BankAccountNum", bankTransferForm.getBankAccountNum());
        model.addAttribute("BankAccountName", bankTransferForm.getBankAccountName());
        model.addAttribute("TransferAmount", bankTransferForm.getDate());
        model.addAttribute("Date", bankTransferForm.getTransferAmount());
        model.addAttribute("bankTransferApplication", bankTransferForm);
        return "bankTransferConfirmation";
    }

    @PostMapping("/bankTransferCompletion")
    public String completion(@ModelAttribute BankTransferForm bankTransferForm, Model model) {
        applyBankTransferService.applyBankTransfer(bankTransferForm);
        return "bankTransferCompletion";
    }

}
