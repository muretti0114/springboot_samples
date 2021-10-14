package com.example.arrayform.dto;

import com.example.arrayform.entity.*;
import java.util.List;
import lombok.Data;

/**
 * 学生一括登録フォーム
 */
@Data
public class StudentsBulkRegistrationForm {
    List <Student> students;
    List <StudentGroup> studentGroups;
}
