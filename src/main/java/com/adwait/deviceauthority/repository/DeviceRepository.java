package com.adwait.deviceauthority.repository;

import com.adwait.deviceauthority.model.DeviceId;
import com.adwait.deviceauthority.model.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Devices, DeviceId> {
}
