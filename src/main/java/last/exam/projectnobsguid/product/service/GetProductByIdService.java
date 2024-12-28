package last.exam.projectnobsguid.product.service;

import last.exam.projectnobsguid.Query;
import last.exam.projectnobsguid.exception.ProductNotFoundException;
import last.exam.projectnobsguid.product.ProductRepository;
import last.exam.projectnobsguid.product.model.Product;
import last.exam.projectnobsguid.product.model.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class GetProductByIdService implements Query<String, ProductDTO> {
    private final ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(GetProductByIdService.class);

    public GetProductByIdService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<ProductDTO> execute(String input) {
        logger.info("Запрос в базу данных с id: {}", input);
        Optional<Product> optionalProduct = productRepository.findById(UUID.fromString(input));
        if (optionalProduct.isEmpty())
            throw new ProductNotFoundException();
        ProductDTO productDTO = new ProductDTO(optionalProduct.get());
        return ResponseEntity.ok(productDTO);
    }
}
