package last.exam.projectnobsguid.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductNotFoundException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(ProductNotFoundException.class);

    public ProductNotFoundException(){
        super(ErrorMessages.ProductNotFound.getTittle());
        logger.error("Выброшено исключение {}", getClass());
    }
}
