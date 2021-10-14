package com.example.arrayform.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.arrayform.dto.StudentsBulkRegistrationForm;
import com.example.arrayform.entity.Student;
import com.example.arrayform.entity.StudentGroup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    
    @GetMapping("/check")
    public String checkStudentBulkRegistration(@ModelAttribute StudentsBulkRegistrationForm bulkForm, Model model) {
       
        StudentsBulkRegistrationForm dummyForm = new StudentsBulkRegistrationForm();
        dummyForm.setStudents(generateDummyStudents());
        dummyForm.setStudentGroups(generateDummyGroups());
        model.addAttribute("bulkForm", dummyForm);
        return "studentBulkForm";
    }
    
    @PostMapping("/bulkRegister")
    public String doStudentBulkRegistration(@ModelAttribute StudentsBulkRegistrationForm bulkForm, Model model) {

        for (StudentGroup g: bulkForm.getStudentGroups()) {
            System.out.println(g);
            //登録処理
        }
 
        for (Student s: bulkForm.getStudents()) {
            System.out.println(s);
             //登録処理
        }

        model.addAttribute("bulkForm", bulkForm);
        return "complete";
    }



    private List<Student> generateDummyStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1L, "9999001m", "神戸一郎", "9999001m@stu.kobe-u.ac.jp", 4, 1L, 
        "http://wsapp.cs.kobe-u.ac.jp/kumanomi/student/hgdfajksdlfjlks;dfjal;kdsf"));
        students.add(new Student(2L, "9999002m", "神戸二郎", "9999001m@stu.kobe-u.ac.jp", 4, 2L, 
        "http://wsapp.cs.kobe-u.ac.jp/kumanomi/student/asdfajksdlfjlks;dfjal;kdsf"));
        students.add(new Student(3L, "9999003m", "神戸三郎", "9999001m@stu.kobe-u.ac.jp", 4, 3L, 
        "http://wsapp.cs.kobe-u.ac.jp/kumanomi/student/ahahajksdlfjlks;dfjal;kdsf"));
        students.add(new Student(4L, "9999004m", "神戸四郎", "9999001m@stu.kobe-u.ac.jp", 4, 1L, 
        "http://wsapp.cs.kobe-u.ac.jp/kumanomi/student/asddsafajksdlfjlks;dfjal;kdsf"));
        students.add(new Student(5L, "9999005m", "神戸五郎", "9999001m@stu.kobe-u.ac.jp", 4, 2L, 
        "http://wsapp.cs.kobe-u.ac.jp/kumanomi/student/yqaqqsdfajksdlfjlks;dfjal;kdsf"));
        students.add(new Student(6L, "9999006m", "神戸六郎", "9999001m@stu.kobe-u.ac.jp", 4, 3L, 
        "http://wsapp.cs.kobe-u.ac.jp/kumanomi/student/234agasdfajksdlfjlks;dfjal;kdsf"));
      
        return students;
    }

    private List<StudentGroup> generateDummyGroups() {
        ArrayList<StudentGroup> groups = new ArrayList<>();
        groups.add(new StudentGroup(1L, "グループ2021_1", 1234));
        groups.add(new StudentGroup(2L, "グループ2021_2", 5678));
        groups.add(new StudentGroup(3L, "グループ2021_3", 9999));

        return groups;
    }


}
