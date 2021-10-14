package com.example.arrayform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * グループエンティティ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentGroup {
    /**
     * グループID
     */
    Long groupId;
    /**
     * グループ名
     */
    String name;
    /**
     * PHS番号
     */
    Integer phs;
}