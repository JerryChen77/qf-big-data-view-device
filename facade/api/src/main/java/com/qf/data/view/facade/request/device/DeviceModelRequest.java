package com.qf.data.view.facade.request.device;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cjl
 * @date 2021/8/25 17:42
 */
@Data
public class DeviceModelRequest implements Serializable {

    private String deviceKey;
    private long lastActiveTime;

}
