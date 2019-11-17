package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void testSpeedWithMercedes() {
        Car mercedes = Car.aNewCarBuilder().withModel(Model.Mercedes).withAge(2).withTierCount(4).withEngineName("A-285")
                .build();

        assertEquals(200, mercedes.getSpeed());
        assertEquals(2, mercedes.getAge());
        assertEquals(4, mercedes.getTierCount());
        assertEquals(Model.Mercedes, mercedes.getModel());
        assertEquals("A-285", mercedes.getEngineName());


    }

    @Test
    void testSpeedWithoutMercedes() {
        Car renault = Car.aNewCarBuilder().withModel(Model.Renault).withAge(11).withTierCount(4).withEngineName("Capture-258")
                .build();

        assertEquals(180, renault.getSpeed());
        assertEquals(11, renault.getAge());
        assertEquals(4, renault.getTierCount());
        assertEquals(Model.Renault, renault.getModel());
        assertEquals("Capture-258", renault.getEngineName());


    }
}
