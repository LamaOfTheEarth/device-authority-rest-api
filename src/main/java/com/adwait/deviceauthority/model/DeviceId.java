package com.adwait.deviceauthority.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;

@Data
public class DeviceId implements Serializable {
    @Column(name="deviceid")
    private String deviceId;
    @Column(name="accountno")
    private String accountNo;
}
