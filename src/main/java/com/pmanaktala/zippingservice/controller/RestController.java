package com.pmanaktala.zippingservice.controller;

import com.pmanaktala.zippingservice.dto.Base64Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private
    @PostMapping("zip/files")
    void helloWorld(HttpServletResponse response, @RequestBody List<Base64Request> requestedFiles) {

    }


}
