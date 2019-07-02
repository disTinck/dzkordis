package com.ora.qh.entity.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author qh
 * @since 2019-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("USER_INFO")
public class Info extends Model<Info> {

    private static final long serialVersionUID = 1L;

    @TableField("USER_ID")
    private String userId;
    @TableField("USERNAME")
    private String username;
    @TableField("PASSWD")
    private String passwd;
    @TableField("BILL_ID")
    private String billId;
    @TableField("EMAIL")
    private String email;
    @TableField("AGE")
    private String age;
    @TableField("BIRTHDAY")
    private Date birthday;
    @TableField("OWN_INDEX")
    private String ownIndex;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
