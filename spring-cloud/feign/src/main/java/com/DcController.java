package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/5.
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;
    @GetMapping("consumer")
    public String dc(){
        return dcClient.consumer();
    }
}
