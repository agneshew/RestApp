package com.agnes.RestApp.service;

import com.agnes.RestApp.model.Pong;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class PongServiceImpl implements PongService {

    @Autowired
    private final Pong pong;

    @Override
    public String getPong() {

        if (log.isErrorEnabled()) {
            log.info("getPong()");
        }
        return pong.getPONG();
    }
}
