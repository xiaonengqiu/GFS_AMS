package com.gfs.ams.entity.admin;

/**
 * 简   述：
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public class SysConfigEntity {
    /**
     * 配置信息id
     */
    private Long id;
    /**
     * 键
     */
    private String key;
    /**
     * 值
     */
    private String value;
    /**
     * 备注
     */
    private String remark;

    /**
     * 获取：配置信息id
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：配置信息id
     * @param id 配置信息id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：键
     * @return String
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置：键
     * @param key 键
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取：值
     * @return String
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置：值
     * @param value 值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取：备注
     * @return String
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SysConfigEntity{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

