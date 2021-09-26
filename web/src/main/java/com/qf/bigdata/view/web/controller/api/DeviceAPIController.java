package com.qf.bigdata.view.web.controller.api;

import com.qf.bigdata.view.web.service.DeviceService;
import com.qf.data.view.core.model.exception.ViewException;
import com.qf.data.view.core.model.request.DeviceInfoRequest;
import com.qf.data.view.core.model.result.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author Cjl
 * @date 2021/8/25 18:30
 */


@RestController
@RequestMapping("/device")
public class DeviceAPIController {

@Autowired
private DeviceService deviceService;

@PostMapping("/info")
public ResultModel deviceInfo(@RequestBody DeviceInfoRequest deviceInfoRequest){
    if (Objects.isNull(deviceInfoRequest)){
        try {
            throw new ViewException("参数异常");
        } catch (ViewException e) {
            return ResultModel.error();
        }
    }
        return deviceService.deviceInfo(deviceInfoRequest);
    }
}
