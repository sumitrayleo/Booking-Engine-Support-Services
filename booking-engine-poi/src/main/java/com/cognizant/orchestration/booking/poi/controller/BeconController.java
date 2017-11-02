package com.cognizant.orchestration.booking.poi.controller;

import com.cognizant.orchestration.booking.poi.dto.DeviceInformation;
import com.cognizant.orchestration.booking.poi.dto.RegistrationInformation;
import com.cognizant.orchestration.booking.poi.service.BeconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeconController {

    @Autowired
    private BeconService beconService;

    @RequestMapping(value = "/api/info/addBecons", method = RequestMethod.POST, produces = "application/json")
    public RegistrationInformation addBecons(@RequestBody final DeviceInformation deviceInformation) {
        return beconService.addBecons(deviceInformation);
    }
}
