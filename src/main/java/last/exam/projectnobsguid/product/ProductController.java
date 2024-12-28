package last.exam.projectnobsguid.product;

import last.exam.projectnobsguid.product.model.ProductDTO;
import last.exam.projectnobsguid.product.service.DeleteProductService;
import last.exam.projectnobsguid.product.service.GetProductByIdService;
import last.exam.projectnobsguid.product.service.GetProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/product")
public class ProductController {
    private final GetProductByIdService getProductByIdService;
    private final GetProductsService getProductsService;
    private final DeleteProductService deleteProductService;

    public ProductController(GetProductByIdService getProductByIdService,
                             GetProductsService getProductsService,
                             DeleteProductService deleteProductService) {
        this.getProductByIdService = getProductByIdService;
        this.getProductsService = getProductsService;
        this.deleteProductService = deleteProductService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable String id) {
        return getProductByIdService.execute(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return getProductsService.execute(null);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        return deleteProductService.execute(id);
    }
}
