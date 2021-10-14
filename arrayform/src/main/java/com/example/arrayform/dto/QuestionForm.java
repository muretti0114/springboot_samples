package com.example.arrayform.dto;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

@Data
public class QuestionForm {
    String qid;
    String Date;
    List<QuestionDetailsForm> questions;

    public QuestionForm () {

    }

    /**
     * num個の空質問を入れたフォームを作る
     * @param num
     */
    public QuestionForm(int num) {
        ArrayList<QuestionDetailsForm> qList = new ArrayList<>(); 
        for (int i=0; i<num; i++) {
            QuestionDetailsForm q = new QuestionDetailsForm();
            q.setSortNum(Long.valueOf(i+1));
            qList.add(q);
        }
        questions = qList;
    }
}
