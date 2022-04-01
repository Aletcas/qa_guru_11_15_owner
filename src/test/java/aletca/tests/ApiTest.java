package aletca.tests;

import aletca.apiConfig.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @BeforeAll
    static void jumpToTokenValue() {
        System.setProperty("tokenProperty", "rksdrkeTu76RGFVu&gRF^YG&%RGvftu|Tu76RGFVu&gRF^YG&%RGvftu");
    }

    @Test
    void tokenMatchingCheck() {
        ApiConfig owner = ConfigFactory.create(ApiConfig.class, System.getProperties());
    }
}
