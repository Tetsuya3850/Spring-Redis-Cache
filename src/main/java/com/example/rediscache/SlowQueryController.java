package com.example.rediscache;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SlowQueryController {

    private final SlowQueryService slowQueryService;

    @GetMapping("/query/{id}")
    public SlowQueryResult queryById(
            @PathVariable Long id
    ) {
        return slowQueryService.queryById(id);
    }
}
