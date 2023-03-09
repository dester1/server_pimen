package ru.biponline.demo.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.biponline.demo.entity.PublishingEntity;

@Data
@EqualsAndHashCode(callSuper = false)
public class PublishingResponse extends BaseResponse {
    public PublishingResponse(boolean success, String message, PublishingEntity publishing){
        super(success,message);
        this.publishing=publishing;
    }
    public PublishingResponse(PublishingEntity publishing){
        super(true,"Publishing Data");
    }
    private PublishingEntity publishing;
}
