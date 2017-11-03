package com.cognizant.orchestration.booking.poi.service;

import com.cognizant.orchestration.booking.poi.dto.DeviceInformation;
import com.cognizant.orchestration.booking.poi.dto.GetBeconRequest;
import com.cognizant.orchestration.booking.poi.dto.RegistrationInformation;
import com.cognizant.orchestration.booking.poi.util.ProcessBeconData;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class BeconService {

    public RegistrationInformation addBecons(final DeviceInformation deviceInformation) {
        final ProcessBeconData processBeconData = new ProcessBeconData();
        final RegistrationInformation registrationInformation = new RegistrationInformation();
        registrationInformation.setRegistertered(processBeconData.addBecon(deviceInformation));
        return registrationInformation;
    }

    public RegistrationInformation isBeconPresent(final GetBeconRequest getBeconRequest) {
        final ProcessBeconData processBeconData = new ProcessBeconData();
        final RegistrationInformation registrationInformation = new RegistrationInformation();
        registrationInformation.setRegistertered(processBeconData.findBecon(getBeconRequest));
        return registrationInformation;
    }
}
