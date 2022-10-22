package com.example.subjectservice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "subjets")
public class Subject  implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private int subId;
    private  String name;
    private  String  credit;
}
