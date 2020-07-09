package net.arver.mall.goods.model;

import java.io.Serializable;

public class Para implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_para.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_para.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_para.options
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String options;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_para.seq
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_para.template_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer templateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_para
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_para.id
     *
     * @return the value of tb_para.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_para.id
     *
     * @param id the value for tb_para.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_para.name
     *
     * @return the value of tb_para.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_para.name
     *
     * @param name the value for tb_para.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_para.options
     *
     * @return the value of tb_para.options
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getOptions() {
        return options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_para.options
     *
     * @param options the value for tb_para.options
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setOptions(String options) {
        this.options = options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_para.seq
     *
     * @return the value of tb_para.seq
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_para.seq
     *
     * @param seq the value for tb_para.seq
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_para.template_id
     *
     * @return the value of tb_para.template_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_para.template_id
     *
     * @param templateId the value for tb_para.template_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_para
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
        sb.append(", name=").append(name);
        sb.append(", options=").append(options);
        sb.append(", seq=").append(seq);
        sb.append(", templateId=").append(templateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}