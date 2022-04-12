package ru.gb.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "\"public\".\"PRODUCT\"")
@NamedQueries({
        @NamedQuery(name = "Product.findTitleById",
                query = "select m.title from \"public\".\"PRODUCT\" m where m.id = :id"),
        @NamedQuery(name = "Product.findById",
                query = "select m from \"public\".\"PRODUCT\" m where m.id = :id")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private BigDecimal cost;
    @Column(name = "date")
    private LocalDate date;
}
