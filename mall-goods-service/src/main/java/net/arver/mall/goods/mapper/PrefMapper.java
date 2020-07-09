package net.arver.mall.goods.mapper;

import java.util.List;
import net.arver.mall.goods.model.Pref;
import net.arver.mall.goods.model.PrefExample;
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

public interface PrefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=PrefSqlProvider.class, method="countByExample")
    long countByExample(PrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @DeleteProvider(type=PrefSqlProvider.class, method="deleteByExample")
    int deleteByExample(PrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Delete({
        "delete from tb_pref",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Insert({
        "insert into tb_pref (cate_id, buy_money, ",
        "pre_money, start_time, ",
        "end_time, type, state)",
        "values (#{cateId,jdbcType=INTEGER}, #{buyMoney,jdbcType=INTEGER}, ",
        "#{preMoney,jdbcType=INTEGER}, #{startTime,jdbcType=DATE}, ",
        "#{endTime,jdbcType=DATE}, #{type,jdbcType=CHAR}, #{state,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Pref record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @InsertProvider(type=PrefSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Pref record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @SelectProvider(type=PrefSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER),
        @Result(column="buy_money", property="buyMoney", jdbcType=JdbcType.INTEGER),
        @Result(column="pre_money", property="preMoney", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.DATE),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.DATE),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.CHAR)
    })
    List<Pref> selectByExample(PrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Select({
        "select",
        "id, cate_id, buy_money, pre_money, start_time, end_time, type, state",
        "from tb_pref",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER),
        @Result(column="buy_money", property="buyMoney", jdbcType=JdbcType.INTEGER),
        @Result(column="pre_money", property="preMoney", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.DATE),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.DATE),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.CHAR)
    })
    Pref selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=PrefSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Pref record, @Param("example") PrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=PrefSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Pref record, @Param("example") PrefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @UpdateProvider(type=PrefSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Pref record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pref
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    @Update({
        "update tb_pref",
        "set cate_id = #{cateId,jdbcType=INTEGER},",
          "buy_money = #{buyMoney,jdbcType=INTEGER},",
          "pre_money = #{preMoney,jdbcType=INTEGER},",
          "start_time = #{startTime,jdbcType=DATE},",
          "end_time = #{endTime,jdbcType=DATE},",
          "type = #{type,jdbcType=CHAR},",
          "state = #{state,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pref record);
}