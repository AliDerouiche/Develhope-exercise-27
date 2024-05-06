package com.example.hibernateAdding;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "enrollments")
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "studentId", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "classId", nullable = false)
    private Class classes;
}