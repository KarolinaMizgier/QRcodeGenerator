package com.karolinaprojects.qrcodegenerator.api;

import com.karolinaprojects.qrcodegenerator.service.QRcodeGeneratorService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = QRcodeController.class)
public class QRcodeControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private QRcodeGeneratorService generatorService;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetQR() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/kod"))
                .andExpect(status().isOk());
    }
}
