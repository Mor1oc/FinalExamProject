package last.exam.projectnobsguid.product.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class RegionConverter implements AttributeConverter<Region, String> {
    @Override
    public String convertToDatabaseColumn(Region region) {
        return region.getTittle();
    }

    @Override
    public Region convertToEntityAttribute(String s) {
        return Region.fromString(s);
    }
}
