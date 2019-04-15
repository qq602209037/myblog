package com.yw.myblog.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class EmployeeFh {
    @Excel(name = "商务发货任务（元）")
    String swfhrw;
    @Excel(name="商务发货完成（元）")
    String swfhwc;
    @Excel(name = "发货得分")
    String fhdf;
    @Excel(name = "本月超额")
    String byce;
    @Excel(name = "上月超额转本月")
    String sycezby;
    @Excel(name = "超额分")
    String cef;
    @Excel(name = "分数合计（10）")
    String fshj;
    @Excel(name = "结转下月超额（元）")
    String jzxyce;

    public String getSwfhrw() {
        return swfhrw;
    }

    public void setSwfhrw(String swfhrw) {
        this.swfhrw = swfhrw;
    }

    public String getSwfhwc() {
        return swfhwc;
    }

    public void setSwfhwc(String swfhwc) {
        this.swfhwc = swfhwc;
    }

    public String getFhdf() {
        return fhdf;
    }

    public void setFhdf(String fhdf) {
        this.fhdf = fhdf;
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
