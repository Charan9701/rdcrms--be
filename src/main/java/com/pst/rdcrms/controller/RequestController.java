package com.pst.rdcrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pst.rdcrms.entity.RequestEntity;
import com.pst.rdcrms.response.RequestResponse;
import com.pst.rdcrms.service.RequestService;

@RestController
@RequestMapping("api/request")
@CrossOrigin(origins = "*")
public class RequestController {
	
	@Autowired
    private RequestService requestService;

    @PostMapping("/sendCertificateRequest")
    public RequestResponse createRequest(@RequestBody RequestEntity requestEntity){
        return requestService.saveRequest(requestEntity);
    }

}
