package com.adwait.deviceauthority.controller;

import com.adwait.deviceauthority.model.DeviceId;
import com.adwait.deviceauthority.model.Devices;
import com.adwait.deviceauthority.repository.DeviceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/devices")
@AllArgsConstructor
public class DeviceController {

    @Autowired
    private final DeviceRepository repository;

    @GetMapping("/list")
    public Iterable<Devices> findAll() {
        return repository.findAll().stream().filter(devices -> devices.getState() == 1).toList();
    }

    @PostMapping("/add")
    @ResponseBody
    public Devices addDevice(
            @RequestBody Devices newDevice
    ) {
        newDevice.setDeviceId(String.valueOf(UUID.randomUUID()));
        return repository.save(newDevice);
    }

    @PutMapping("/edit")
    public Devices editDevice(
            @RequestParam(name = "deviceId") String deviceId,
            @RequestParam(name = "accountNo") String accountNo,
            @RequestBody Devices newDevice
    ) {
        DeviceId deviceIdObject = new DeviceId();
        deviceIdObject.setDeviceId(deviceId);
        deviceIdObject.setAccountNo(accountNo);
        return repository.findById(deviceIdObject)
            .map(device -> {
                if(newDevice.getAccountNo() != null) {
                    device.setAccountNo(newDevice.getAccountNo());
                }
                if (newDevice.getPlatform() != null){
                    device.setPlatform(newDevice.getPlatform());
                }
                if (newDevice.getState() != null) {
                    device.setState(newDevice.getState());
                }
                if (newDevice.getOsName() != null) {
                    device.setOsName(newDevice.getOsName());
                }
                if (newDevice.getUpdateTime() != null) {
                    device.setUpdateTime(newDevice.getUpdateTime());
                }
                if (newDevice.getCreationTime() != null){
                    device.setCreationTime(newDevice.getCreationTime());
                }
                return repository.save(device);
            }).orElseGet(() -> {
                return repository.save(newDevice);
            });
    }

    @DeleteMapping("/delete")
    void deleteEmployee(
        @RequestParam(name = "deviceId") String deviceId,
        @RequestParam(name = "accountNo") String accountNo
    ) {
        DeviceId deviceIdObject = new DeviceId();
        deviceIdObject.setDeviceId(deviceId);
        deviceIdObject.setAccountNo(accountNo);
        repository.deleteById(deviceIdObject);
    }
}
