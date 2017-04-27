package com.dong.controller;

import com.dong.service.QrcodeService;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by dong on 2017/4/25.
 */
@Controller
public class QrcodeController {

    @Autowired
    private QrcodeService qrcodeService;

    @RequestMapping("/enQrcode")
    public void enQrcode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,WriterException {
        // Set to expire far in the past.
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");

        // return a jpeg
        response.setContentType("image/jpeg");


        OutputStream out = response.getOutputStream();
        BitMatrix bitMatrix = qrcodeService.enQrcode("hello");
        String format = "JPG";
        // write the data out
        MatrixToImageWriter.writeToStream(bitMatrix, format, out);// 输出图像
        try {
            out.flush();
        } finally {
            out.close();
        }
    }

}
