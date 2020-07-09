package net.arver.mall.goods.model;

import java.io.Serializable;
import java.util.Date;

public class Pref implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.cate_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer cateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.buy_money
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer buyMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.pre_money
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer preMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.start_time
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.end_time
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.type
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pref.state
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.id
     *
     * @return the value of tb_pref.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.id
     *
     * @param id the value for tb_pref.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.cate_id
     *
     * @return the value of tb_pref.cate_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.cate_id
     *
     * @param cateId the value for tb_pref.cate_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.buy_money
     *
     * @return the value of tb_pref.buy_money
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getBuyMoney() {
        return buyMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.buy_money
     *
     * @param buyMoney the value for tb_pref.buy_money
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setBuyMoney(Integer buyMoney) {
        this.buyMoney = buyMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.pre_money
     *
     * @return the value of tb_pref.pre_money
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getPreMoney() {
        return preMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.pre_money
     *
     * @param preMoney the value for tb_pref.pre_money
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setPreMoney(Integer preMoney) {
        this.preMoney = preMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.start_time
     *
     * @return the value of tb_pref.start_time
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.start_time
     *
     * @param startTime the value for tb_pref.start_time
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.end_time
     *
     * @return the value of tb_pref.end_time
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.end_time
     *
     * @param endTime the value for tb_pref.end_time
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.type
     *
     * @return the value of tb_pref.type
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.type
     *
     * @param type the value for tb_pref.type
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pref.state
     *
     * @return the value of tb_pref.state
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pref.state
     *
     * @param state the value for tb_pref.state
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cateId=").append(cateId);
        sb.append(", buyMoney=").append(buyMoney);
        sb.append(", preMoney=").append(preMoney);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}