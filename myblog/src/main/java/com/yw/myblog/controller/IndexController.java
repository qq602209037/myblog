package com.yw.myblog.controller;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.yw.myblog.entity.Employee;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.Reflection;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author a1387537
 */

@Controller
public class IndexController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index (Model model){
        return "index";
    }

    @RequestMapping(value = "upload")
    public String upload(){
        return "upload";
    }

    @RequestMapping(value = "uploadFile")
    public String execUpload(MultipartFile file) throws Exception {
        ImportParams importParams = new ImportParams();

        importParams.setHeadRows(1);
        importParams.setTitleRows(1);
        importParams.setLastOfInvalidRow(2);
        long start = System.currentTimeMillis();
        List<Employee> result = ExcelImportUtil.importExcel(file.getInputStream(),Employee.class,importParams);

        for(int i = 0;i<result.size();++i){
            System.out.println(ReflectionToStringBuilder.toString(result.get(i)));
        }
        System.out.println(result.get(0).getFhObj().get(0).getByce());
        System.exit(1);
        return "";
    }
}
