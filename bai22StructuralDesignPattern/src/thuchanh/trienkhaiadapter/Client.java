package thuchanh.trienkhaiadapter;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path) {
        long size = fileCalculator.calculatorSize(path);
        System.out.println("Size: " + size);
    }
}
