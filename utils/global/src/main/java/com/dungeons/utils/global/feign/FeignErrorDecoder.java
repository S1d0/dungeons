package com.dungeons.utils.global.feign;

import com.dungeons.utils.global.exceptions.DungeonsException;
import com.dungeons.utils.global.exceptions.DungeonsInternalException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FeignErrorDecoder implements ErrorDecoder {
    @Autowired
    ObjectMapper mapper;

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            return mapper.readValue(response.body().asReader(), DungeonsException.class);
        } catch (IOException e) {
            throw new DungeonsInternalException("Exception while mapping : "+ e.getMessage(), null);
        }
    }
}
