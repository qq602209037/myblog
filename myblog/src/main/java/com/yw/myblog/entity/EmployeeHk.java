package com.yw.myblog.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

@ExcelTarget("employeeHk")
public class EmployeeHk {
    @Excel(name = "商务回款任务（元）")
    String swhkrw;
    @Excel(name = "商务回款完成（元）")
    String swhkwc;
    @Excel(name = "回款得分")
    String hkdf;
    @Excel(name = "本月超额")
    String byce;
    @Excel(name = "上月超额转本月")
    String sycezby;
    @Excel(name = "超额分")
    String cef;
    @Excel(name = "分数合计（5）")
    String fshj;
    @Excel(name = "结转下月超额（元）")
    String jzxyce;


    public String getSwhkrw() {
        return swhkrw;
    }

    public void setSwhkrw(String swhkrw) {
        this.swhkrw = swhkrw;
    }

    public String getSwhkwc() {
        return swhkwc;
    }

    public void setSwhkwc(String swhkwc) {
        this.swhkwc = swhkwc;
    }

    public String getHkdf() {
        return hkdf;
    }

    public void setHkdf(String hkdf) {
        this.hkdf = hkdf;
    }

    public String getByce() {
        return byce;
    }

    public void setByce(String byce) {
        this.byce = byce;
    }

    public String getSycezby() {
        return sycezby;
    }

    public void setSycezby(String sycezby) {
        this.sycezby = sycezby;
    }

    public String getCef() {
        return cef;
    }

    public void setCef(String cef) {
        this.cef = cef;
    }

    public String getFshj() {
        return fshj;
    }

    public void setFshj(String fshj) {
        this.fshj = fshj;
    }

    public String getJzxyce() {
        return jzxyce;
    }

    public void setJzxyce(String jzxyce) {
        this.jzxyce = jzxyce;
    }
}
