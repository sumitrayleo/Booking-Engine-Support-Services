package com.cognizant.orchestration.booking.poi.service;

import com.cognizant.orchestration.booking.poi.dto.DeviceInformation;
import com.cognizant.orchestration.booking.poi.util.ProcessBeconData;
import org.springframework.stereotype.Service;

@Service
public class BeconService {

    public boolean addBecons(final DeviceInformation deviceInformation) {
        final ProcessBeconData processBeconData = new ProcessBeconData();
        return processBeconData.addBecon(deviceInformation);
    }
}
