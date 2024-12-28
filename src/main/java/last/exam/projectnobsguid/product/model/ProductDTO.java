package last.exam.projectnobsguid.product.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ProductDTO {
    private String id;
    private String description;
    private double price;
    private String manufacture;
    private String category;
    private String region;

    public ProductDTO (Product product) {
        this.id = product.getId().toString();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.manufacture = product.getManufacture();
        this.category = product.getDescription();
        this.region = product.getRegion().getTittle();
    }
}
