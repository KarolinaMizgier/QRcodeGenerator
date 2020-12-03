package com.karolinaprojects.qrcodegenerator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class QRcodeGeneratorServiceTest {

    @Autowired
    QRcodeGeneratorService qrCodeGeneratorService;

    @Test
    public void testGenerateQRCodeImage(){
        UUID uuid = UUID.fromString("8fda41f0-aa8e-4759-a3a5-6e515c46be40");
        String expected = "[-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 37, 0, 0, 0, 37, 1, 0, 0, 0, 0, -19, -27, 29, -82, 0, 0, 0, -77, 73, 68, 65, 84, 120, 94, 99, -8, 15, 4, 63, 24, 48, -55, 15, -78, 122, 7, 42, 24, -66, 95, -19, -113, -81, 96, -8, 18, -81, 127, 17, 72, 6, 58, -126, -56, -24, 31, -127, 64, -15, 75, -7, 64, -15, 15, -94, -95, 14, 21, 12, -1, 127, 28, 3, -87, 119, 122, -88, -11, -125, -31, -5, 86, -71, -74, 10, -122, 63, -67, -51, -59, 63, 24, 62, -21, -85, -2, -5, -63, -16, 81, -46, 123, -27, 15, -122, 127, -22, 95, -124, -128, 122, 121, -14, -35, 127, 48, 124, -85, -70, 95, 86, -63, -16, 45, -24, -59, -50, 31, 12, 95, -33, -117, 29, -85, 96, -8, -38, -34, -97, 12, 20, -81, 52, -33, 4, 20, -71, -17, -64, 2, 52, -13, -13, -65, 98, -96, -7, 2, 57, 33, 64, 51, 111, 28, 47, -5, -63, -16, 37, -20, 33, 35, -112, 12, -106, -37, 7, 52, 39, -72, -19, 24, 80, -4, -78, 93, 26, -48, 94, 97, -17, -77, -40, -36, 15, 38, 1, 21, 74, -126, -77, -44, 80, 2, 53, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126]";

        byte[] result = qrCodeGeneratorService.generateQRCodeImage(10, 10, uuid);
        final String resultString = Arrays.toString(result);

        assertEquals(expected,resultString);
    }

}
