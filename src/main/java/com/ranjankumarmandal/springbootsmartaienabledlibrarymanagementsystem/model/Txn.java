package com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Txn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn
    @ManyToOne
    private Student student;

    @JoinColumn
    @ManyToOne
    private Book book;

    private int paidCost;

    @Enumerated(value = EnumType.STRING)
    private TxnStatus txnStatus;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;
}
