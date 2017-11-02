package com.cognizant.orchestration.booking.poi.service;

import com.cognizant.orchestration.booking.poi.dto.DeviceInformation;
import com.cognizant.orchestration.booking.poi.dto.RegistrationInformation;
import com.cognizant.orchestration.booking.poi.util.ProcessBeconData;
import org.springframework.stereotype.Service;

@Service
public class BeconService {

    public RegistrationInformation addBecons(final DeviceInformation deviceInformation) {
        final ProcessBeconData processBeconData = new ProcessBeconData();
        final RegistrationInformation registrationInformation = new RegistrationInformation();
        registrationInformation.setRegistertered(processBeconData.addBecon(deviceInformation));
        return registrationInformation;
    }
}
