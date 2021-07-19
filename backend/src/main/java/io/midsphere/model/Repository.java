package io.midsphere.model;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 仓库管理
 * @author liqiwen
 */
public class Repository implements Serializable {


    /**
     * 仓库主键标记
     */
    private Integer id;


    /**
     * 仓库地址
     */
    private String repositoryUrl;


    /**
     * 仓库类型
     */
    private RepositoryEnum repositoryEnum;


    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 修改时间
     */
    private LocalDateTime modifyAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public RepositoryEnum getRepositoryEnum() {
        return repositoryEnum;
    }

    public void setRepositoryEnum(RepositoryEnum repositoryEnum) {
        this.repositoryEnum = repositoryEnum;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }
}
