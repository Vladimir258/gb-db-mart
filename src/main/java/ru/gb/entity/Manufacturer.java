package ru.gb.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "MANUFACTURER")
@NamedQueries({
        @NamedQuery(name = "Manufacturer.findNameById",
                query = "select m.name from Manufacturer m where m.id = :id"),
        @NamedQuery(name = "Manufacturer.findById",
                query = "select m from Manufacturer m where m.id = :id")
})
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "names")
    private String name;

    @Transient
    private Set<Product> products;

    public boolean addProduct(Product product) {
        if (products == null) {
            products = new HashSet<>();
        }
        return products.add(product);
    }
}
