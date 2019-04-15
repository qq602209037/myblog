package com.yw.myblog.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;

import java.util.List;

public class Employee {
    @Excel(name="办事处")
    String bsc;
    @Excel(name="姓名")
    String xm;
    @Excel(name = "工作态度（5）")
    String gztd;
    @Excel(name = "安全与卫生（5）")
    String aqyws;
    @Excel(name="劳动纪律（5）")
    String ldjl;
    @Excel(name = "订货（10）")
    String dh;
    @Excel(name = "发货（10）")
    String fh;
    @Excel(name="结算（10）")
    String js;
    @Excel(name = "费用（10）")
    String fy;
    @Excel(name = "销售流向（30）")
    String xslx;
    @ExcelCollection(name="发货")
    List<EmployeeFh> fhObj;
    @ExcelCollection(name = "回款")
    List<EmployeeHk> hkObj;
    @Excel(name = "销售任务（15）")
    String xsrw;
    @Excel(name = "分数合计")
    String fshj;
    @Excel(name = "月考核奖（元）")
    String ykhj;
    @Excel(name = "备注")
    String bz;

    public String getLdjl() {
        return ldjl;
    }

    public void setLdjl(String ldjl) {
        this.ldjl = ldjl;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getFh() {
        return fh;
    }

    public void setFh(String fh) {
        this.fh = fh;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getFy() {
        return fy;
    }

    public void setFy(String fy) {
        this.fy = fy;
    }

    public String getXslx() {
        return xslx;
    }

    public void setXslx(String xslx) {
        this.xslx = xslx;
    }

    public List<EmployeeFh> getFhObj() {
        return fhObj;
    }

    public void setFhObj(List<EmployeeFh> fhObj) {
        this.fhObj = fhObj;
    }

    public List<EmployeeHk> getHkObj() {
        return hkObj;
    }

    public void setHkObj(List<EmployeeHk> hkObj) {
        this.hkObj = hkObj;
    }

    public String getXsrw() {
        return xsrw;
    }

    public void setXsrw(String xsrw) {
        this.xsrw = xsrw;
    }

    public String getFshj() {
        return fshj;
    }

    public void setFshj(String fshj) {
        this.fshj = fshj;
    }

    public String getYkhj() {
        return ykhj;
    }

    public void setYkhj(String ykhj) {
        this.ykhj = ykhj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getBsc() {
        return bsc;
    }

    public void setBsc(String bsc) {
        this.bsc = bsc;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getGztd() {
        return gztd;
    }

    public void setGztd(String gztd) {
        this.gztd = gztd;
    }

    public String getAqyws() {
        return aqyws;
    }

    public void setAqyws(String aqyws) {
        this.aqyws = aqyws;
    }
}
