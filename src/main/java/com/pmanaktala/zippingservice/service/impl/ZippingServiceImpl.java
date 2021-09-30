package com.pmanaktala.zippingservice.service.impl;

import com.pmanaktala.zippingservice.dto.Base64Request;
import com.pmanaktala.zippingservice.service.ZippingService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZippingServiceImpl implements ZippingService {

    @Override
    public void zipBase64Content(HttpServletResponse response, List<Base64Request> requestList) {

        try (ZipOutputStream zos = new ZipOutputStream(response.getOutputStream())) {
            response.setHeader("Content-Type", "application/zip");
            response.setHeader("Content-Disposition", "attachment; filename=\"AllFiles.zip\"");
            response.flushBuffer();

            for (Base64Request request : requestList) {
                ZipEntry entry = new ZipEntry(request.getFileName());
                zos.putNextEntry(entry);
                byte[] fileBytes = Base64.getDecoder().decode(request.getBase64Content());
                zos.write(fileBytes);
                zos.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
