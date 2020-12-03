package com.karolinaprojects.qrcodegenerator.api;

import com.karolinaprojects.qrcodegenerator.service.QRcodeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class QRcodeController {

    @Autowired
    private QRcodeGeneratorService qrCodeGeneratorService;

    @GetMapping(path ="/kod", produces = MediaType.IMAGE_GIF_VALUE)
    public byte[] getQR(@RequestParam(required = false, defaultValue = "#{${app.qr-code-width}}") Integer width,
                        @RequestParam(required = false, defaultValue = "#{${app.qr-code-height}}") Integer height) {
        return qrCodeGeneratorService.generateQRCodeImage(width, height, UUID.randomUUID());
    }
}
