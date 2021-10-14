package com.example.arrayform.dto;

import lombok.Data;

@Data
public class QuestionDetailsForm {
    Long qdid;
    Long sortNum;
    String questionBody;
    String questionType;
}
