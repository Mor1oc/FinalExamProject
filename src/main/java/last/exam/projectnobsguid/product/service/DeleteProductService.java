package last.exam.projectnobsguid.product.service;

import last.exam.projectnobsguid.Command;
import last.exam.projectnobsguid.product.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteProductService implements Command<String, Void> {
    private final ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(DeleteProductService.class);

    public DeleteProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<Void> execute(String input) {
        logger.info("Удаление продукта с id: {}", input);
        productRepository.deleteById(UUID.fromString(input));
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
