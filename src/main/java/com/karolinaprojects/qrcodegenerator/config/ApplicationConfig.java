package com.karolinaprojects.qrcodegenerator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class ApplicationConfig {
    private String qrCodeWidth;
    private String qrCodeHeight;

    public String getQrCodeWidth() {
        return qrCodeWidth;
    }

    public void setQrCodeWidth(String qrCodeWidth) {
        this.qrCodeWidth = qrCodeWidth;
    }

    public String getQrCodeHeight() {
        return qrCodeHeight;
    }

    public void setQrCodeHeight(String qrCodeHeight) {
        this.qrCodeHeight = qrCodeHeight;
    }
}
