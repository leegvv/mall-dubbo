package net.arver.mall.goods.mapper;

import java.util.List;
import java.util.Map;
import net.arver.mall.goods.model.Spu;
import net.arver.mall.goods.model.SpuExample.Criteria;
import net.arver.mall.goods.model.SpuExample.Criterion;
import net.arver.mall.goods.model.SpuExample;
import org.apache.ibatis.jdbc.SQL;

public class SpuSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String countByExample(SpuExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_spu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String deleteByExample(SpuExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_spu");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String insertSelective(Spu record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_spu");

        if (record.getSn() != null) {
            sql.VALUES("sn", "#{sn,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getCaption() != null) {
            sql.VALUES("caption", "#{caption,jdbcType=VARCHAR}");
        }

        if (record.getBrandId() != null) {
            sql.VALUES("brand_id", "#{brandId,jdbcType=INTEGER}");
        }

        if (record.getCategory1Id() != null) {
            sql.VALUES("category1_id", "#{category1Id,jdbcType=INTEGER}");
        }

        if (record.getCategory2Id() != null) {
            sql.VALUES("category2_id", "#{category2Id,jdbcType=INTEGER}");
        }

        if (record.getCategory3Id() != null) {
            sql.VALUES("category3_id", "#{category3Id,jdbcType=INTEGER}");
        }

        if (record.getTemplateId() != null) {
            sql.VALUES("template_id", "#{templateId,jdbcType=INTEGER}");
        }

        if (record.getFreightId() != null) {
            sql.VALUES("freight_id", "#{freightId,jdbcType=INTEGER}");
        }

        if (record.getImage() != null) {
            sql.VALUES("image", "#{image,jdbcType=VARCHAR}");
        }

        if (record.getImages() != null) {
            sql.VALUES("images", "#{images,jdbcType=VARCHAR}");
        }

        if (record.getSaleService() != null) {
            sql.VALUES("sale_service", "#{saleService,jdbcType=VARCHAR}");
        }

        if (record.getSpecItems() != null) {
            sql.VALUES("spec_items", "#{specItems,jdbcType=VARCHAR}");
        }

        if (record.getParaItems() != null) {
            sql.VALUES("para_items", "#{paraItems,jdbcType=VARCHAR}");
        }

        if (record.getSaleNum() != null) {
            sql.VALUES("sale_num", "#{saleNum,jdbcType=INTEGER}");
        }

        if (record.getCommentNum() != null) {
            sql.VALUES("comment_num", "#{commentNum,jdbcType=INTEGER}");
        }

        if (record.getIsMarketable() != null) {
            sql.VALUES("is_marketable", "#{isMarketable,jdbcType=CHAR}");
        }

        if (record.getIsEnableSpec() != null) {
            sql.VALUES("is_enable_spec", "#{isEnableSpec,jdbcType=CHAR}");
        }

        if (record.getIsDelete() != null) {
            sql.VALUES("is_delete", "#{isDelete,jdbcType=CHAR}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=CHAR}");
        }

        if (record.getIntroduction() != null) {
            sql.VALUES("introduction", "#{introduction,jdbcType=LONGVARCHAR}");
        }

        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String selectByExampleWithBLOBs(SpuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("sn");
        sql.SELECT("name");
        sql.SELECT("caption");
        sql.SELECT("brand_id");
        sql.SELECT("category1_id");
        sql.SELECT("category2_id");
        sql.SELECT("category3_id");
        sql.SELECT("template_id");
        sql.SELECT("freight_id");
        sql.SELECT("image");
        sql.SELECT("images");
        sql.SELECT("sale_service");
        sql.SELECT("spec_items");
        sql.SELECT("para_items");
        sql.SELECT("sale_num");
        sql.SELECT("comment_num");
        sql.SELECT("is_marketable");
        sql.SELECT("is_enable_spec");
        sql.SELECT("is_delete");
        sql.SELECT("status");
        sql.SELECT("introduction");
        sql.FROM("tb_spu");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String selectByExample(SpuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("sn");
        sql.SELECT("name");
        sql.SELECT("caption");
        sql.SELECT("brand_id");
        sql.SELECT("category1_id");
        sql.SELECT("category2_id");
        sql.SELECT("category3_id");
        sql.SELECT("template_id");
        sql.SELECT("freight_id");
        sql.SELECT("image");
        sql.SELECT("images");
        sql.SELECT("sale_service");
        sql.SELECT("spec_items");
        sql.SELECT("para_items");
        sql.SELECT("sale_num");
        sql.SELECT("comment_num");
        sql.SELECT("is_marketable");
        sql.SELECT("is_enable_spec");
        sql.SELECT("is_delete");
        sql.SELECT("status");
        sql.FROM("tb_spu");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Spu record = (Spu) parameter.get("record");
        SpuExample example = (SpuExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("tb_spu");

        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }

        if (record.getSn() != null) {
            sql.SET("sn = #{record.sn,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }

        if (record.getCaption() != null) {
            sql.SET("caption = #{record.caption,jdbcType=VARCHAR}");
        }

        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        }

        if (record.getCategory1Id() != null) {
            sql.SET("category1_id = #{record.category1Id,jdbcType=INTEGER}");
        }

        if (record.getCategory2Id() != null) {
            sql.SET("category2_id = #{record.category2Id,jdbcType=INTEGER}");
        }

        if (record.getCategory3Id() != null) {
            sql.SET("category3_id = #{record.category3Id,jdbcType=INTEGER}");
        }

        if (record.getTemplateId() != null) {
            sql.SET("template_id = #{record.templateId,jdbcType=INTEGER}");
        }

        if (record.getFreightId() != null) {
            sql.SET("freight_id = #{record.freightId,jdbcType=INTEGER}");
        }

        if (record.getImage() != null) {
            sql.SET("image = #{record.image,jdbcType=VARCHAR}");
        }

        if (record.getImages() != null) {
            sql.SET("images = #{record.images,jdbcType=VARCHAR}");
        }

        if (record.getSaleService() != null) {
            sql.SET("sale_service = #{record.saleService,jdbcType=VARCHAR}");
        }

        if (record.getSpecItems() != null) {
            sql.SET("spec_items = #{record.specItems,jdbcType=VARCHAR}");
        }

        if (record.getParaItems() != null) {
            sql.SET("para_items = #{record.paraItems,jdbcType=VARCHAR}");
        }

        if (record.getSaleNum() != null) {
            sql.SET("sale_num = #{record.saleNum,jdbcType=INTEGER}");
        }

        if (record.getCommentNum() != null) {
            sql.SET("comment_num = #{record.commentNum,jdbcType=INTEGER}");
        }

        if (record.getIsMarketable() != null) {
            sql.SET("is_marketable = #{record.isMarketable,jdbcType=CHAR}");
        }

        if (record.getIsEnableSpec() != null) {
            sql.SET("is_enable_spec = #{record.isEnableSpec,jdbcType=CHAR}");
        }

        if (record.getIsDelete() != null) {
            sql.SET("is_delete = #{record.isDelete,jdbcType=CHAR}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=CHAR}");
        }

        if (record.getIntroduction() != null) {
            sql.SET("introduction = #{record.introduction,jdbcType=LONGVARCHAR}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_spu");

        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("sn = #{record.sn,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("caption = #{record.caption,jdbcType=VARCHAR}");
        sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        sql.SET("category1_id = #{record.category1Id,jdbcType=INTEGER}");
        sql.SET("category2_id = #{record.category2Id,jdbcType=INTEGER}");
        sql.SET("category3_id = #{record.category3Id,jdbcType=INTEGER}");
        sql.SET("template_id = #{record.templateId,jdbcType=INTEGER}");
        sql.SET("freight_id = #{record.freightId,jdbcType=INTEGER}");
        sql.SET("image = #{record.image,jdbcType=VARCHAR}");
        sql.SET("images = #{record.images,jdbcType=VARCHAR}");
        sql.SET("sale_service = #{record.saleService,jdbcType=VARCHAR}");
        sql.SET("spec_items = #{record.specItems,jdbcType=VARCHAR}");
        sql.SET("para_items = #{record.paraItems,jdbcType=VARCHAR}");
        sql.SET("sale_num = #{record.saleNum,jdbcType=INTEGER}");
        sql.SET("comment_num = #{record.commentNum,jdbcType=INTEGER}");
        sql.SET("is_marketable = #{record.isMarketable,jdbcType=CHAR}");
        sql.SET("is_enable_spec = #{record.isEnableSpec,jdbcType=CHAR}");
        sql.SET("is_delete = #{record.isDelete,jdbcType=CHAR}");
        sql.SET("status = #{record.status,jdbcType=CHAR}");
        sql.SET("introduction = #{record.introduction,jdbcType=LONGVARCHAR}");

        SpuExample example = (SpuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_spu");

        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("sn = #{record.sn,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("caption = #{record.caption,jdbcType=VARCHAR}");
        sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        sql.SET("category1_id = #{record.category1Id,jdbcType=INTEGER}");
        sql.SET("category2_id = #{record.category2Id,jdbcType=INTEGER}");
        sql.SET("category3_id = #{record.category3Id,jdbcType=INTEGER}");
        sql.SET("template_id = #{record.templateId,jdbcType=INTEGER}");
        sql.SET("freight_id = #{record.freightId,jdbcType=INTEGER}");
        sql.SET("image = #{record.image,jdbcType=VARCHAR}");
        sql.SET("images = #{record.images,jdbcType=VARCHAR}");
        sql.SET("sale_service = #{record.saleService,jdbcType=VARCHAR}");
        sql.SET("spec_items = #{record.specItems,jdbcType=VARCHAR}");
        sql.SET("para_items = #{record.paraItems,jdbcType=VARCHAR}");
        sql.SET("sale_num = #{record.saleNum,jdbcType=INTEGER}");
        sql.SET("comment_num = #{record.commentNum,jdbcType=INTEGER}");
        sql.SET("is_marketable = #{record.isMarketable,jdbcType=CHAR}");
        sql.SET("is_enable_spec = #{record.isEnableSpec,jdbcType=CHAR}");
        sql.SET("is_delete = #{record.isDelete,jdbcType=CHAR}");
        sql.SET("status = #{record.status,jdbcType=CHAR}");

        SpuExample example = (SpuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String updateByPrimaryKeySelective(Spu record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_spu");

        if (record.getSn() != null) {
            sql.SET("sn = #{sn,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getCaption() != null) {
            sql.SET("caption = #{caption,jdbcType=VARCHAR}");
        }

        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{brandId,jdbcType=INTEGER}");
        }

        if (record.getCategory1Id() != null) {
            sql.SET("category1_id = #{category1Id,jdbcType=INTEGER}");
        }

        if (record.getCategory2Id() != null) {
            sql.SET("category2_id = #{category2Id,jdbcType=INTEGER}");
        }

        if (record.getCategory3Id() != null) {
            sql.SET("category3_id = #{category3Id,jdbcType=INTEGER}");
        }

        if (record.getTemplateId() != null) {
            sql.SET("template_id = #{templateId,jdbcType=INTEGER}");
        }

        if (record.getFreightId() != null) {
            sql.SET("freight_id = #{freightId,jdbcType=INTEGER}");
        }

        if (record.getImage() != null) {
            sql.SET("image = #{image,jdbcType=VARCHAR}");
        }

        if (record.getImages() != null) {
            sql.SET("images = #{images,jdbcType=VARCHAR}");
        }

        if (record.getSaleService() != null) {
            sql.SET("sale_service = #{saleService,jdbcType=VARCHAR}");
        }

        if (record.getSpecItems() != null) {
            sql.SET("spec_items = #{specItems,jdbcType=VARCHAR}");
        }

        if (record.getParaItems() != null) {
            sql.SET("para_items = #{paraItems,jdbcType=VARCHAR}");
        }

        if (record.getSaleNum() != null) {
            sql.SET("sale_num = #{saleNum,jdbcType=INTEGER}");
        }

        if (record.getCommentNum() != null) {
            sql.SET("comment_num = #{commentNum,jdbcType=INTEGER}");
        }

        if (record.getIsMarketable() != null) {
            sql.SET("is_marketable = #{isMarketable,jdbcType=CHAR}");
        }

        if (record.getIsEnableSpec() != null) {
            sql.SET("is_enable_spec = #{isEnableSpec,jdbcType=CHAR}");
        }

        if (record.getIsDelete() != null) {
            sql.SET("is_delete = #{isDelete,jdbcType=CHAR}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=CHAR}");
        }

        if (record.getIntroduction() != null) {
            sql.SET("introduction = #{introduction,jdbcType=LONGVARCHAR}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spu
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    protected void applyWhere(SQL sql, SpuExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }

        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }

        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }

                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }

                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }

        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
