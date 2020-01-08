package com.zzy.model.po;
import lombok.Data;

@Data
public class VdRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_role.id
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_role.username
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_role.password
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_role.level
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    private Integer level;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_role.id
     *
     * @return the value of vd_role.id
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_role.id
     *
     * @param id the value for vd_role.id
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_role.username
     *
     * @return the value of vd_role.username
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_role.username
     *
     * @param username the value for vd_role.username
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_role.password
     *
     * @return the value of vd_role.password
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_role.password
     *
     * @param password the value for vd_role.password
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_role.level
     *
     * @return the value of vd_role.level
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_role.level
     *
     * @param level the value for vd_role.level
     *
     * @mbg.generated Wed Jan 08 14:27:59 CST 2020
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}