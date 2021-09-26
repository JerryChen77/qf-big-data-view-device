package com.qf.bigdata.view.web.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.bigdata.view.web.service.DeviceService;
import com.qf.data.view.core.model.request.DeviceInfoRequest;
import com.qf.data.view.core.model.result.ResultModel;
import com.qf.data.view.facade.api.DeviceFacade;
import com.qf.data.view.facade.request.device.DeviceModelRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author Cjl
 * @date 2021/8/25 18:40
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Reference
    private DeviceFacade deviceFacade;

    @Override
    public ResultModel deviceInfo(DeviceInfoRequest deviceInfoRequest) {
        DeviceModelRequest deviceModelRequest = new DeviceModelRequest();

        BeanUtils.copyProperties(deviceInfoRequest,deviceModelRequest);

        return  deviceFacade.DeviceInfo(deviceModelRequest);

    }
}
