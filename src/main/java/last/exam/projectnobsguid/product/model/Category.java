package last.exam.projectnobsguid.product.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "category")
    private String category;
}
