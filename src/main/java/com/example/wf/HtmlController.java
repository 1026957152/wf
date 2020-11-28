package com.example.wf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import verification.TrackingOuterClass;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author rongrong
 * @version 1.0
 * @description:
 * @date 2019/12/28 21:32
 */
@Controller
public class HtmlController {
    @Autowired
    public VerificationGrpcClient verificationGrpcClient;
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @ResponseBody
    public Map index(){
        try {

				TrackingOuterClass.Tracking tracking = verificationGrpcClient.createTracking(UUID.randomUUID().toString(),
						new HashMap<>(),
						new HashMap<>());
        } catch (MyBusinessException e) {
            e.printStackTrace();
        }

        return Map.of("aaa","aaa");
    }
}