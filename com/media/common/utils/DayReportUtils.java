package com.media.common.utils;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lihaiqiang on 2018/08/12.
 */
public class DayReportUtils {
    private static final String DOC_PREFIX_PATH = "\\\\192.168.1.100\\tools\\工作进度\\2018日报";

    private static final String DATE_FORMATE = "yyyy/MM/dd";

    private DayLog log = new DayLog();

    private Date getCurDate() {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMATE);
        try {
            Date d = format.parse(String.valueOf(format.format(new Date())));
            return d;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    
    
    
    public static void main(String[] args) {
        DayReportUtils dayReportUtils = new DayReportUtils();
        String excelPath = DOC_PREFIX_PATH + File.separator + "( 王强)工作进度表.xlsx";
        try {
//            dayReportUtils.showExcel(excelPath);
            dayReportUtils.insertExcel(excelPath, dayReportUtils.log);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dayReportUtils.getCurDate()); // 读完一行后换行

    }

    /**
     * 读取，全部sheet表及数据
     *
     * @throws Exception
     */
    public void showExcel(String filePath) throws Exception {
        @SuppressWarnings("resource")
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(filePath)));
        XSSFSheet sheet = null;
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {// 获取每个Sheet表
            sheet = workbook.getSheetAt(i);
            for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum，获取最后一行的行标
                XSSFRow row = sheet.getRow(j);
                if (row != null) {
                    for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum，是获取最后一个不为空的列是第几个
                        if (row.getCell(k) != null) { // getCell 获取单元格数据
                            System.out.print(row.getCell(k) + "\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                }
                System.out.println(""); // 读完一行后换行
            }
            System.out.println("读取sheet表：" + workbook.getSheetName(i) + " 完成");
        }
    }

    /**
     * 写入，往指定sheet表的单元格
     *
     * @throws Exception
     */
    public void insertExcel(String filePath, DayLog log) throws Exception {
        @SuppressWarnings("resource")
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(filePath))); // 读取的文件
        XSSFSheet sheet = workbook.getSheetAt(0);
        boolean isWrite = false;
        XSSFRow row = null;
        String curDate = DateUtils.format(new Date(), DATE_FORMATE);
        for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum，获取最后一行的行标
            row = sheet.getRow(j);
            if (row != null) {
                for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum，是获取最后一个不为空的列是第几个
                    Object value = null;
                    if (row.getCell(k) != null) { // getCell 获取单元格数据
                        value = getCellValue(row.getCell(k));
                        System.out.print(value + "\t");
                    } else {
                        System.out.print("\t");
                    }
                    if (k == 4 && row.getCell(k) != null && curDate.equals(value.toString())) {
                        isWrite = true;
                        break;
                    }
                }
                System.out.println("");
            }
            if (isWrite) {
                break;
            }
        }

        if (!isWrite) {
            row = sheet.createRow(sheet.getLastRowNum() + 1); // 该行无数据，创建行对象
            writeLog(row, log);
        }
        FileOutputStream fo = new FileOutputStream(filePath); // 输出到文件
        workbook.write(fo);
    }

    @SuppressWarnings("unused")
    private Object getCellValue(XSSFCell cell) {
        Object value = null;
        if (null != cell) {
            if (cell == null) {
                return "";
            }
            DecimalFormat df = new DecimalFormat("0");// 格式化 number String
            // 字符
            SimpleDateFormat sdf = new SimpleDateFormat(
                    DATE_FORMATE);// 格式化日期字符串
            DecimalFormat nf = new DecimalFormat("0");// 格式化数字
            switch (cell.getCellType()) {
                case XSSFCell.CELL_TYPE_STRING:
                    value = cell.getStringCellValue();
                    break;
                case XSSFCell.CELL_TYPE_NUMERIC:
                    if ("@".equals(cell.getCellStyle().getDataFormatString())) {
                        value = df.format(cell.getNumericCellValue());
                    } else if ("General".equals(cell.getCellStyle()
                            .getDataFormatString())) {
                        value = nf.format(cell.getNumericCellValue());
                    } else {
                        value = sdf.format(HSSFDateUtil.getJavaDate(cell
                                .getNumericCellValue()));
                    }
                    break;
                case XSSFCell.CELL_TYPE_BOOLEAN:
                    value = cell.getBooleanCellValue();
                    break;
                case XSSFCell.CELL_TYPE_BLANK:
                    value = "";
                    break;
                default:
                    value = cell.toString();
            }
        }
        return value;
    }

    private void writeLog(XSSFRow row, DayLog log) {
        row.createCell(0).setCellValue(log.getProjectName());
        row.createCell(1).setCellValue(log.getTitle());
        row.createCell(2).setCellValue(log.getDesc());
        row.createCell(3).setCellValue(log.getUserName());
        row.createCell(4).setCellValue(log.getStartDate());
        row.createCell(5).setCellValue(log.getEndDate());
        row.createCell(6).setCellValue(log.getRate());
        row.createCell(7).setCellValue(log.getHelp());
        row.createCell(8).setCellValue(log.getFinishDate());
    }

    public class DayLog {
        public DayLog() {
        }

        private String projectName = "无人机项目";
        private String dayDate = DateUtils.format(new Date(), DATE_FORMATE);
        private String title = "产品评论接口iso调试";
        private String desc = "产品评论接口iso调试";
        private String userName = "李海强";
        private String startDate = dayDate;
        private String endDate = dayDate;
        private String help = "无";
        private String rate = "90%";
        private String finishDate = dayDate;

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getDayDate() {
            return dayDate;
        }

        public void setDayDate(String dayDate) {
            this.dayDate = dayDate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getFinishDate() {
            return finishDate;
        }

        public void setFinishDate(String finishDate) {
            this.finishDate = finishDate;
        }

        public String getHelp() {
            return help;
        }

        public void setHelp(String help) {
            this.help = help;
        }
    }

}
