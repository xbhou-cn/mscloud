package xb.hou.mscloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @title: Payment
 * @Author xbhou
 * @Date: 2021-08-30 23:45
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 流水号
     */
    private String serial;
}
