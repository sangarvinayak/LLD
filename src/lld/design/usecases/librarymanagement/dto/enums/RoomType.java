package lld.design.usecases.librarymanagement.dto.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum RoomType {

    STANDARD(
            Constants.STANDARD_PRICE,
            Collections.EMPTY_LIST,
            Collections.EMPTY_LIST
    ),
    DELUXE(
            Constants.DELUXE_PRICE,
            Arrays.asList(Service.FOOD),
            Arrays.asList(Amentiy.GYM)
    ),
    SUITE(
            Constants.SUITE_PRICE,
            Arrays.asList(Service.FOOD, Service.LAUNDRY),
            Arrays.asList(Amentiy.GYM, Amentiy.POOL)
    );

    private Double price;
    private List<Service> services;
    private List<Amentiy> amenities;

    RoomType(Double price, List<Service> services, List<Amentiy> amenities) {
        this.price = price;
        this.services = services;
        this.amenities = amenities;
    }

    private static class Constants {
        public static final double STANDARD_PRICE = 100.0;
        public static final double DELUXE_PRICE = 500.0;
        public static final double SUITE_PRICE = 1000.0;
    }

    public Double getPrice() {
        return price;
    }

    public List<Service> getServices() {
        return services;
    }

    public List<Amentiy> getAmenities() {
        return amenities;
    }
}
