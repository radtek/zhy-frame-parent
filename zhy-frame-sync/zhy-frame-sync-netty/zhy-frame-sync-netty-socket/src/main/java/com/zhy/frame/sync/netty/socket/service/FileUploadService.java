package com.zhy.frame.sync.netty.socket.service;

import com.zhy.frame.sync.netty.socket.model.vo.ResponseJson;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface FileUploadService {

    ResponseJson upload(MultipartFile file, HttpServletRequest request);
}
