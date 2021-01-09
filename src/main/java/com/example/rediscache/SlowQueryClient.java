package com.example.rediscache;

import org.springframework.stereotype.Component;

@Component
public class SlowQueryClient {

    public SlowQueryResult queryById(Long id) {
        try {
            Thread.sleep(1000 * 5);
        } catch (Exception ex) {
            // Do Nothing
        }
        return new SlowQueryResult(id);
    }
}
