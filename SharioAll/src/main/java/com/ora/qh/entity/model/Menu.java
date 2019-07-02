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
@TableName("USER_MENU")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    @TableField("USER_ID")
    private String userId;
    @TableField("USERNAME")
    private String username;
    @TableField("MENU_FLAG")
    private String menuFlag;
    @TableField("CARD_ID")
    private String cardId;
    @TableField("BILL_ID")
    private String billId;
    @TableField("ACTIVE_CODE")
    private String activeCode;
    @TableField("START_DATE")
    private Date startDate;
    @TableField("END_DATE")
    private Date endDate;
    @TableField("STATE")
    private String state;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
