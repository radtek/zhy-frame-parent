/**
 * 描述:
 * 包名:com.zhy.mongo.ro
 * 版本信息: 版本1.0
 * 日期:2019年1月10日  下午1:48:42
 * Copyright xxxx科技有限公司
 */

package com.zhy.frame.oss.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @describe：
 * @author: lvmoney /xxxx科技有限公司
 * @version:v1.0 2019年1月10日 下午1:48:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileBaseOutVo implements Serializable {
    /**
     *
     */


    private static final long serialVersionUID = 2140300165458755036L;
    private String fileId;
    private String fileName;
    private String fileType;
    private long size;

}
