package com.zhy.frame.ipfs.common.vo;/**
 * 描述:
 * 包名:com.zhy.frame.ipfs.common.vo
 * 版本信息: 版本1.0
 * 日期:2020/5/7
 * Copyright XXXXXX科技有限公司
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @describe：
 * @author: lvmoney/XXXXXX科技有限公司
 * @version:v1.0 2020/5/7 8:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileByteOutVo implements Serializable {
    private static final long serialVersionUID = -619821052006195815L;
    private byte[] fileByte;
}
