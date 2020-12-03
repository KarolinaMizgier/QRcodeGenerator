package com.karolinaprojects.qrcodegenerator.service;

import net.glxn.qrgen.javase.QRCode;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

@Service
public class QRcodeGeneratorService {
    public byte[] generateQRCodeImage(int width, int height, UUID uuid) {
        ByteArrayOutputStream stream = QRCode
                .from(uuid.toString())
                .withSize(width, height)
                .stream();
        ByteArrayInputStream bis = new ByteArrayInputStream(stream.toByteArray());
        return bis.readAllBytes();
    }

}
