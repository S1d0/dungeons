package com.dungeons.utils.globalexceptions.exceptions.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorInfo {
    private String key;
    private String reason;
}
