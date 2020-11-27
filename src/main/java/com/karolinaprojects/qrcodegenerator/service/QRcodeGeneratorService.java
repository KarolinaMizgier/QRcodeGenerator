package com.karolinaprojects.qrcodegenerator.service;

import net.glxn.qrgen.javase.QRCode;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

@Service
public class QRcodeGeneratorService {
    public byte[] generateQRCodeImage() {
        ByteArrayOutputStream stream = QRCode
                .from(UUID.randomUUID().toString())
                .withSize(250, 250)
                .stream();
        ByteArrayInputStream bis = new ByteArrayInputStream(stream.toByteArray());

        return bis.readAllBytes();
    }

}
