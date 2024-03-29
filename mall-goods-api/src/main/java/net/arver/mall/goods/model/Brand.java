package net.arver.mall.goods.model;

import java.io.Serializable;

public class Brand implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.image
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.letter
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String letter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.seq
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.id
     *
     * @return the value of tb_brand.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.id
     *
     * @param id the value for tb_brand.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.name
     *
     * @return the value of tb_brand.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.name
     *
     * @param name the value for tb_brand.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.image
     *
     * @return the value of tb_brand.image
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.image
     *
     * @param image the value for tb_brand.image
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.letter
     *
     * @return the value of tb_brand.letter
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getLetter() {
        return letter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.letter
     *
     * @param letter the value for tb_brand.letter
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.seq
     *
     * @return the value of tb_brand.seq
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.seq
     *
     * @param seq the value for tb_brand.seq
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
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
        sb.append(", image=").append(image);
        sb.append(", letter=").append(letter);
        sb.append(", seq=").append(seq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}