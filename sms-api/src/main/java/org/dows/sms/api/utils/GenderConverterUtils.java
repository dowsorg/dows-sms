package org.dows.sms.api.utils;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

public class GenderConverterUtils implements Converter<Boolean> {

    public static final String VALID = "有效";
    public static final String INVALID = "无效";

    @Override
    public Class supportJavaTypeKey() {
        return Boolean.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.BOOLEAN;
    }

    @Override
    public Boolean convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return true;
    }

    @Override
    public WriteCellData<?> convertToExcelData(Boolean value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if (value) {
            return new WriteCellData(VALID);
        } else {
            return new WriteCellData(INVALID);
        }
    }
}
