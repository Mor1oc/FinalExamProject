package last.exam.projectnobsguid.product.service;

import last.exam.projectnobsguid.Query;
import last.exam.projectnobsguid.product.ProductRepository;
import last.exam.projectnobsguid.product.model.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductsService implements Query<Void, List<ProductDTO>> {
    private final ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(GetProductsService.class);

    public GetProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<List<ProductDTO>> execute(Void input) {
        logger.info("Запрос на получение всех продуктов");
        List<ProductDTO> products = productRepository.findAll()
                .stream()
                .map(ProductDTO::new)
                .toList();
        return ResponseEntity.ok(products);
    }
}
