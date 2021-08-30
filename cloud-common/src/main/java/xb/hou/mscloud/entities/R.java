package xb.hou.mscloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @title: Rs
 * @Author xbhou
 * @Date: 2021-08-30 23:49
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    private Integer code;
    private String message;
    private T data;

    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
