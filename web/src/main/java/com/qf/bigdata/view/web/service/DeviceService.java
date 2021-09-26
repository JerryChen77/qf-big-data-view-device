package com.qf.bigdata.view.web.service;

import com.qf.data.view.core.model.request.DeviceInfoRequest;
import com.qf.data.view.core.model.result.ResultModel;

/**
 * @author Cjl
 * @date 2021/8/25 18:38
 */
public interface DeviceService {
    ResultModel deviceInfo(DeviceInfoRequest deviceInfoRequest);
}
