package com.dungeons.utils.globalexceptions.exceptions;

import com.dungeons.utils.globalexceptions.exceptions.error.ErrorInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

// No args constr for jackson use
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class AbstractError extends RuntimeException {
    private List<ErrorInfo> errorInfors;

    public AbstractError(String s, List<ErrorInfo> errorInfo) {
        super(s);
    }
}
