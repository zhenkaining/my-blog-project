package com.wq.website.modal.Bo;

import com.wq.website.modal.Vo.DataSourceVo;

/**
 * Created by BlueT on 2017/3/4.
 */
public class InstallBo extends DataSourceVo {
    private String AdminUser;
    private String siteTitle;
    private String siteUrl;
    private String adminEmail;
    private String adminPwd;

    public String getAdminUser() {
        return AdminUser;
    }

    public void setAdminUser(String adminUser) {
        AdminUser = adminUser;
    }

    public String getSiteTitle() {
        return siteTitle;
    }

    public void setSiteTitle(String siteTitle) {
        this.siteTitle = siteTitle;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    @Override
    public String toString() {
        return "InstallBo{" +
                "AdminUser='" + AdminUser + '\'' +
                ", siteTitle='" + siteTitle + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminPwd='" + adminPwd + '\'' +
                '}';
    }
}
