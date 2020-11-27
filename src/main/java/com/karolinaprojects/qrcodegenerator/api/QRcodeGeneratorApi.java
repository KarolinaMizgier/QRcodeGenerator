package com.karolinaprojects.qrcodegenerator.api;
import com.karolinaprojects.qrcodegenerator.service.QRcodeGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class QRcodeGeneratorApi {

    @Autowired
    private QRcodeGeneratorService qrCodeGeneratorService;

    @GetMapping(path ="/kod", produces = MediaType.IMAGE_GIF_VALUE)
    public byte[] getQR() {
        return qrCodeGeneratorService.generateQRCodeImage();
    }
}
