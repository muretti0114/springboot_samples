package com.example.arrayform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    Long id; // 通し番号(自動生成)
    String studentId; // 学籍番号
    String name; // 名前
    String email; // Eメール
    Integer grade; // 学年
    Long groupId; // グループID
    String url; // ハッシュにより生成されたURL
}
