package net.arver.mall.goods.model;

import java.io.Serializable;

public class Spu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.sn
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.caption
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String caption;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.brand_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.category1_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer category1Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.category2_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer category2Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.category3_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer category3Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.template_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer templateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.freight_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer freightId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.image
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.images
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String images;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.sale_service
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String saleService;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.spec_items
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String specItems;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.para_items
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String paraItems;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.sale_num
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer saleNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.comment_num
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private Integer commentNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.is_marketable
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String isMarketable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.is_enable_spec
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String isEnableSpec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.is_delete
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.status
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_spu.introduction
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.id
     *
     * @return the value of tb_spu.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.id
     *
     * @param id the value for tb_spu.id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.sn
     *
     * @return the value of tb_spu.sn
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.sn
     *
     * @param sn the value for tb_spu.sn
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.name
     *
     * @return the value of tb_spu.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.name
     *
     * @param name the value for tb_spu.name
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.caption
     *
     * @return the value of tb_spu.caption
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getCaption() {
        return caption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.caption
     *
     * @param caption the value for tb_spu.caption
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.brand_id
     *
     * @return the value of tb_spu.brand_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.brand_id
     *
     * @param brandId the value for tb_spu.brand_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.category1_id
     *
     * @return the value of tb_spu.category1_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getCategory1Id() {
        return category1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.category1_id
     *
     * @param category1Id the value for tb_spu.category1_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setCategory1Id(Integer category1Id) {
        this.category1Id = category1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.category2_id
     *
     * @return the value of tb_spu.category2_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getCategory2Id() {
        return category2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.category2_id
     *
     * @param category2Id the value for tb_spu.category2_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setCategory2Id(Integer category2Id) {
        this.category2Id = category2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.category3_id
     *
     * @return the value of tb_spu.category3_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getCategory3Id() {
        return category3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.category3_id
     *
     * @param category3Id the value for tb_spu.category3_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setCategory3Id(Integer category3Id) {
        this.category3Id = category3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.template_id
     *
     * @return the value of tb_spu.template_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.template_id
     *
     * @param templateId the value for tb_spu.template_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.freight_id
     *
     * @return the value of tb_spu.freight_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getFreightId() {
        return freightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.freight_id
     *
     * @param freightId the value for tb_spu.freight_id
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setFreightId(Integer freightId) {
        this.freightId = freightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.image
     *
     * @return the value of tb_spu.image
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.image
     *
     * @param image the value for tb_spu.image
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.images
     *
     * @return the value of tb_spu.images
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getImages() {
        return images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.images
     *
     * @param images the value for tb_spu.images
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.sale_service
     *
     * @return the value of tb_spu.sale_service
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getSaleService() {
        return saleService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.sale_service
     *
     * @param saleService the value for tb_spu.sale_service
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.spec_items
     *
     * @return the value of tb_spu.spec_items
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getSpecItems() {
        return specItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.spec_items
     *
     * @param specItems the value for tb_spu.spec_items
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setSpecItems(String specItems) {
        this.specItems = specItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.para_items
     *
     * @return the value of tb_spu.para_items
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getParaItems() {
        return paraItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.para_items
     *
     * @param paraItems the value for tb_spu.para_items
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setParaItems(String paraItems) {
        this.paraItems = paraItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.sale_num
     *
     * @return the value of tb_spu.sale_num
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.sale_num
     *
     * @param saleNum the value for tb_spu.sale_num
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.comment_num
     *
     * @return the value of tb_spu.comment_num
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.comment_num
     *
     * @param commentNum the value for tb_spu.comment_num
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.is_marketable
     *
     * @return the value of tb_spu.is_marketable
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getIsMarketable() {
        return isMarketable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.is_marketable
     *
     * @param isMarketable the value for tb_spu.is_marketable
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setIsMarketable(String isMarketable) {
        this.isMarketable = isMarketable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.is_enable_spec
     *
     * @return the value of tb_spu.is_enable_spec
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getIsEnableSpec() {
        return isEnableSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.is_enable_spec
     *
     * @param isEnableSpec the value for tb_spu.is_enable_spec
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setIsEnableSpec(String isEnableSpec) {
        this.isEnableSpec = isEnableSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.is_delete
     *
     * @return the value of tb_spu.is_delete
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.is_delete
     *
     * @param isDelete the value for tb_spu.is_delete
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.status
     *
     * @return the value of tb_spu.status
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.status
     *
     * @param status the value for tb_spu.status
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_spu.introduction
     *
     * @return the value of tb_spu.introduction
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_spu.introduction
     *
     * @param introduction the value for tb_spu.introduction
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
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
        sb.append(", sn=").append(sn);
        sb.append(", name=").append(name);
        sb.append(", caption=").append(caption);
        sb.append(", brandId=").append(brandId);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", category3Id=").append(category3Id);
        sb.append(", templateId=").append(templateId);
        sb.append(", freightId=").append(freightId);
        sb.append(", image=").append(image);
        sb.append(", images=").append(images);
        sb.append(", saleService=").append(saleService);
        sb.append(", specItems=").append(specItems);
        sb.append(", paraItems=").append(paraItems);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", isMarketable=").append(isMarketable);
        sb.append(", isEnableSpec=").append(isEnableSpec);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", status=").append(status);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}