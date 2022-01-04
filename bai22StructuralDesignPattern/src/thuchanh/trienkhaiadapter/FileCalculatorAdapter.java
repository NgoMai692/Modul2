package thuchanh.trienkhaiadapter;

import sun.reflect.misc.FieldUtil;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator{
    @Override
    public long calculatorSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
