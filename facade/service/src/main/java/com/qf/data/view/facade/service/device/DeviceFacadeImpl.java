package com.qf.data.view.facade.service.device;

import com.alibaba.dubbo.config.annotation.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qf.data.view.core.model.result.ResultModel;
import com.qf.data.view.facade.api.DeviceFacade;
import com.qf.data.view.facade.request.device.DeviceModelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author Cjl
 * @date 2021/8/25 17:49
 */
@Service
public class DeviceFacadeImpl implements DeviceFacade {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    public static final String DEVICE_TOPIC = "device_topic";

    @Override
    public ResultModel DeviceInfo(DeviceModelRequest deviceModelRequest) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            //将request转为json字符串格式
            String json = mapper.writeValueAsString(deviceModelRequest);
            //kafka生产者发送消息
            kafkaTemplate.send(DEVICE_TOPIC,json);
        } catch (JsonProcessingException e) {
            return ResultModel.error();
        }

        return ResultModel.success();
    }
}
