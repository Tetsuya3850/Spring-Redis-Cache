package com.example.rediscache;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class SlowQueryResult implements Serializable {
    private Long id;
}
