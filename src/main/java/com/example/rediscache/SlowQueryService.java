package com.example.rediscache;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SlowQueryService {

    private final SlowQueryClient slowQueryClient;

    @Cacheable("query-by-id")
    public SlowQueryResult queryById(Long id) {
        return slowQueryClient.queryById(id);
    }
}
