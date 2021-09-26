package com.qf.data.view.core.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cjl
 * @date 2021/8/25 18:33
 */
@Data
public class DeviceInfoRequest implements Serializable {
    private String deviceKey;
    private long lastActiveTime;

}
