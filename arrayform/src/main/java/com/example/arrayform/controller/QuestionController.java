package com.example.arrayform.controller;

import java.util.List;

import com.example.arrayform.dto.QuestionDetailsForm;
import com.example.arrayform.dto.QuestionForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionController {

    @GetMapping("/")    
    public String showForm(@ModelAttribute QuestionForm questionForm, Model model) {
        QuestionForm qForm = new QuestionForm(10);
        model.addAttribute("questionForm", qForm);
        return "arrayform";
    }

    @PostMapping("/")
    public String createForm(@ModelAttribute QuestionForm questionForm, Model model) {

        System.out.println("Posted QuesionForm");
        List<QuestionDetailsForm> questions = questionForm.getQuestions();
        for (QuestionDetailsForm q: questions) {
            System.out.println(q);
        }

        model.addAttribute("questionForm", questionForm);

        return "arrayForm";
    }
    
}
