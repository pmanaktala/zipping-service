package com.pmanaktala.zippingservice.service;

import com.pmanaktala.zippingservice.dto.Base64Request;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ZippingService {

    void zipBase64Content(HttpServletResponse response, List<Base64Request> requestList);

}
