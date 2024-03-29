package net.arver.mall.goods.mapper;

import java.util.List;
import net.arver.mall.goods.model.Spu;
import net.arver.mall.goods.model.SpuExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=SpuSqlProvider.class, method="countByExample")
    long countByExample(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @DeleteProvider(type=SpuSqlProvider.class, method="deleteByExample")
    int deleteByExample(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Delete({
        "delete from tb_spu",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Insert({
        "insert into tb_spu (sn, name, ",
        "caption, brand_id, ",
        "category1_id, category2_id, ",
        "category3_id, template_id, ",
        "freight_id, image, ",
        "images, sale_service, ",
        "spec_items, para_items, ",
        "sale_num, comment_num, ",
        "is_marketable, is_enable_spec, ",
        "is_delete, status, introduction)",
        "values (#{sn,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{caption,jdbcType=VARCHAR}, #{brandId,jdbcType=INTEGER}, ",
        "#{category1Id,jdbcType=INTEGER}, #{category2Id,jdbcType=INTEGER}, ",
        "#{category3Id,jdbcType=INTEGER}, #{templateId,jdbcType=INTEGER}, ",
        "#{freightId,jdbcType=INTEGER}, #{image,jdbcType=VARCHAR}, ",
        "#{images,jdbcType=VARCHAR}, #{saleService,jdbcType=VARCHAR}, ",
        "#{specItems,jdbcType=VARCHAR}, #{paraItems,jdbcType=VARCHAR}, ",
        "#{saleNum,jdbcType=INTEGER}, #{commentNum,jdbcType=INTEGER}, ",
        "#{isMarketable,jdbcType=CHAR}, #{isEnableSpec,jdbcType=CHAR}, ",
        "#{isDelete,jdbcType=CHAR}, #{status,jdbcType=CHAR}, #{introduction,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=String.class)
    int insert(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @InsertProvider(type=SpuSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=String.class)
    int insertSelective(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=SpuSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sn", property="sn", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="caption", property="caption", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER),
        @Result(column="category1_id", property="category1Id", jdbcType=JdbcType.INTEGER),
        @Result(column="category2_id", property="category2Id", jdbcType=JdbcType.INTEGER),
        @Result(column="category3_id", property="category3Id", jdbcType=JdbcType.INTEGER),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.INTEGER),
        @Result(column="freight_id", property="freightId", jdbcType=JdbcType.INTEGER),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_service", property="saleService", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_items", property="specItems", jdbcType=JdbcType.VARCHAR),
        @Result(column="para_items", property="paraItems", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_num", property="saleNum", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_num", property="commentNum", jdbcType=JdbcType.INTEGER),
        @Result(column="is_marketable", property="isMarketable", jdbcType=JdbcType.CHAR),
        @Result(column="is_enable_spec", property="isEnableSpec", jdbcType=JdbcType.CHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Spu> selectByExampleWithBLOBs(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=SpuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sn", property="sn", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="caption", property="caption", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER),
        @Result(column="category1_id", property="category1Id", jdbcType=JdbcType.INTEGER),
        @Result(column="category2_id", property="category2Id", jdbcType=JdbcType.INTEGER),
        @Result(column="category3_id", property="category3Id", jdbcType=JdbcType.INTEGER),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.INTEGER),
        @Result(column="freight_id", property="freightId", jdbcType=JdbcType.INTEGER),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_service", property="saleService", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_items", property="specItems", jdbcType=JdbcType.VARCHAR),
        @Result(column="para_items", property="paraItems", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_num", property="saleNum", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_num", property="commentNum", jdbcType=JdbcType.INTEGER),
        @Result(column="is_marketable", property="isMarketable", jdbcType=JdbcType.CHAR),
        @Result(column="is_enable_spec", property="isEnableSpec", jdbcType=JdbcType.CHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR)
    })
    List<Spu> selectByExample(SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Select({
        "select",
        "id, sn, name, caption, brand_id, category1_id, category2_id, category3_id, template_id, ",
        "freight_id, image, images, sale_service, spec_items, para_items, sale_num, comment_num, ",
        "is_marketable, is_enable_spec, is_delete, status, introduction",
        "from tb_spu",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="sn", property="sn", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="caption", property="caption", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.INTEGER),
        @Result(column="category1_id", property="category1Id", jdbcType=JdbcType.INTEGER),
        @Result(column="category2_id", property="category2Id", jdbcType=JdbcType.INTEGER),
        @Result(column="category3_id", property="category3Id", jdbcType=JdbcType.INTEGER),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.INTEGER),
        @Result(column="freight_id", property="freightId", jdbcType=JdbcType.INTEGER),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_service", property="saleService", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_items", property="specItems", jdbcType=JdbcType.VARCHAR),
        @Result(column="para_items", property="paraItems", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_num", property="saleNum", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_num", property="commentNum", jdbcType=JdbcType.INTEGER),
        @Result(column="is_marketable", property="isMarketable", jdbcType=JdbcType.CHAR),
        @Result(column="is_enable_spec", property="isEnableSpec", jdbcType=JdbcType.CHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.LONGVARCHAR)
    })
    Spu selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=SpuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Spu record, @Param("example") SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=SpuSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Spu record, @Param("example") SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=SpuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Spu record, @Param("example") SpuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=SpuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Update({
        "update tb_spu",
        "set sn = #{sn,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "caption = #{caption,jdbcType=VARCHAR},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "category1_id = #{category1Id,jdbcType=INTEGER},",
          "category2_id = #{category2Id,jdbcType=INTEGER},",
          "category3_id = #{category3Id,jdbcType=INTEGER},",
          "template_id = #{templateId,jdbcType=INTEGER},",
          "freight_id = #{freightId,jdbcType=INTEGER},",
          "image = #{image,jdbcType=VARCHAR},",
          "images = #{images,jdbcType=VARCHAR},",
          "sale_service = #{saleService,jdbcType=VARCHAR},",
          "spec_items = #{specItems,jdbcType=VARCHAR},",
          "para_items = #{paraItems,jdbcType=VARCHAR},",
          "sale_num = #{saleNum,jdbcType=INTEGER},",
          "comment_num = #{commentNum,jdbcType=INTEGER},",
          "is_marketable = #{isMarketable,jdbcType=CHAR},",
          "is_enable_spec = #{isEnableSpec,jdbcType=CHAR},",
          "is_delete = #{isDelete,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "introduction = #{introduction,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Spu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Update({
        "update tb_spu",
        "set sn = #{sn,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "caption = #{caption,jdbcType=VARCHAR},",
          "brand_id = #{brandId,jdbcType=INTEGER},",
          "category1_id = #{category1Id,jdbcType=INTEGER},",
          "category2_id = #{category2Id,jdbcType=INTEGER},",
          "category3_id = #{category3Id,jdbcType=INTEGER},",
          "template_id = #{templateId,jdbcType=INTEGER},",
          "freight_id = #{freightId,jdbcType=INTEGER},",
          "image = #{image,jdbcType=VARCHAR},",
          "images = #{images,jdbcType=VARCHAR},",
          "sale_service = #{saleService,jdbcType=VARCHAR},",
          "spec_items = #{specItems,jdbcType=VARCHAR},",
          "para_items = #{paraItems,jdbcType=VARCHAR},",
          "sale_num = #{saleNum,jdbcType=INTEGER},",
          "comment_num = #{commentNum,jdbcType=INTEGER},",
          "is_marketable = #{isMarketable,jdbcType=CHAR},",
          "is_enable_spec = #{isEnableSpec,jdbcType=CHAR},",
          "is_delete = #{isDelete,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Spu record);
}
