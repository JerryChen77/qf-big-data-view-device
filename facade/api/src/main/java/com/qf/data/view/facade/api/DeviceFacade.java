package com.qf.data.view.facade.api;

import com.qf.data.view.core.model.result.ResultModel;
import com.qf.data.view.facade.request.device.DeviceModelRequest;

/**
 * @author Cjl
 * @date 2021/8/25 17:41
 */
public interface DeviceFacade {

    ResultModel DeviceInfo(DeviceModelRequest deviceModelRequest);

}
