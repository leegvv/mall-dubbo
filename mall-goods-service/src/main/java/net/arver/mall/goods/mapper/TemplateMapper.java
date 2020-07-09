package net.arver.mall.goods.mapper;

import java.util.List;
import net.arver.mall.goods.model.Template;
import net.arver.mall.goods.model.TemplateExample;
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

public interface TemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=TemplateSqlProvider.class, method="countByExample")
    long countByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @DeleteProvider(type=TemplateSqlProvider.class, method="deleteByExample")
    int deleteByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Delete({
        "delete from tb_template",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Insert({
        "insert into tb_template (name, spec_num, ",
        "para_num)",
        "values (#{name,jdbcType=VARCHAR}, #{specNum,jdbcType=INTEGER}, ",
        "#{paraNum,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @InsertProvider(type=TemplateSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=TemplateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_num", property="specNum", jdbcType=JdbcType.INTEGER),
        @Result(column="para_num", property="paraNum", jdbcType=JdbcType.INTEGER)
    })
    List<Template> selectByExample(TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Select({
        "select",
        "id, name, spec_num, para_num",
        "from tb_template",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec_num", property="specNum", jdbcType=JdbcType.INTEGER),
        @Result(column="para_num", property="paraNum", jdbcType=JdbcType.INTEGER)
    })
    Template selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=TemplateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=TemplateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Template record, @Param("example") TemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=TemplateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_template
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Update({
        "update tb_template",
        "set name = #{name,jdbcType=VARCHAR},",
          "spec_num = #{specNum,jdbcType=INTEGER},",
          "para_num = #{paraNum,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Template record);
}