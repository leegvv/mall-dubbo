package net.arver.mall.goods.mapper;

import java.util.List;
import java.util.Map;
import net.arver.mall.goods.model.CategoryBrand;
import net.arver.mall.goods.model.CategoryBrandExample.Criteria;
import net.arver.mall.goods.model.CategoryBrandExample.Criterion;
import net.arver.mall.goods.model.CategoryBrandExample;
import org.apache.ibatis.jdbc.SQL;

public class CategoryBrandSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String countByExample(CategoryBrandExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_category_brand");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String deleteByExample(CategoryBrandExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_category_brand");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String insertSelective(CategoryBrand record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_category_brand");

        if (record.getCategoryId() != null) {
            sql.VALUES("category_id", "#{categoryId,jdbcType=INTEGER}");
        }

        if (record.getBrandId() != null) {
            sql.VALUES("brand_id", "#{brandId,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String selectByExample(CategoryBrandExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("category_id");
        } else {
            sql.SELECT("category_id");
        }
        sql.SELECT("brand_id");
        sql.FROM("tb_category_brand");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CategoryBrand record = (CategoryBrand) parameter.get("record");
        CategoryBrandExample example = (CategoryBrandExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("tb_category_brand");

        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        }

        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_category_brand");

        sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");

        CategoryBrandExample example = (CategoryBrandExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_category_brand
     *
     * @mbg.generated Wed Jul 08 23:31:15 CST 2020
     */
    protected void applyWhere(SQL sql, CategoryBrandExample example, boolean includeExamplePhrase) {
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
