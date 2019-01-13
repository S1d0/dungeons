package com.dungeons.utils.globalexceptions.exceptions;

import com.dungeons.utils.globalexceptions.exceptions.error.ErrorInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class DungeonsInternalException extends RuntimeException{
    List<ErrorInfo> errorInfos;

    public DungeonsInternalException(String s, List<ErrorInfo> errorInfos) {
        super(s);
        this.errorInfos = errorInfos;
    }
}
