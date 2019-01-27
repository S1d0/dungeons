package com.dungeons.utils.global.exceptions.errors;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class DungeonFieldError extends DungeonError {
    private String key;
    private String reason;

    public DungeonFieldError(String key, String reason) {
        super("ONE OF THE FIELD IS WRONG");
        this.key = key;
        this.reason = reason;
    }

    @Override
    public String getReason() {
        return reason;
    }

    @Override
    public String getKey() {
        return key;
    }
}
