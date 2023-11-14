package com.adwait.deviceauthority.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(DeviceId.class)
public class Devices {
    @Id
    @Column(name="deviceid")
    private String deviceId;
    @Id
    @Column(name="accountno")
    private String accountNo;
    @Column(name="osname")
    private String osName;
    @Column(name="osversion")
    private String osVersion;
    @Column(name="platform")
    private String platform;
    @Column(name="state")
    private Integer state;
    @Column(name="creationtime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationTime;
    @Column(name="updatetime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}

