package last.exam.projectnobsguid.product.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "manufacture")
    private String manufacture;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Convert(converter = RegionConverter.class)
    @Column(name = "region")
    private Region region;
}
