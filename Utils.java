package Java;
import java.io.*;

public class Utils {

    public static StringBuilder readFileStream(String filePath) {
        // Dùng StringBuilder để xây dựng nội dung file
        StringBuilder fileContent = new StringBuilder();
        try {
            // Bắt đầu đọc file bằng BufferedReader
            BufferedReader inputReader = new BufferedReader(new FileReader(filePath));
            String lines;
            // Bắt đầu đọc từng dòng trong file
            while ((lines = inputReader.readLine()) != null) {
                fileContent.append(lines).append("\n");
            }
            inputReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public static void writeFileStream(String fileContent, String filePath) {
        try {
            BufferedWriter outputWriter = new BufferedWriter(new FileWriter(filePath));
            outputWriter.write(fileContent);
            outputWriter.close();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    public static File searchFileName(String folderPath, String fileName) {
        // Folder cũng chính là 1 file
        File folder = new File(folderPath);
        // Một mảng các file chính là folder
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.getName().equals(fileName)) {
                    return f;
                }
            }
        }
        return null;
    }

    public static void appendContentToFile(String fileContent, String filePath) {
        try {
            // Đọc nội dung hiện tại của tệp tin
            StringBuilder currentContent = readFileStream(filePath);

            // Ghi nội dung mới và cuối cùng của tệp tin
            BufferedWriter output = new BufferedWriter(new FileWriter(filePath));
            output.write(currentContent.toString() + "\n" + fileContent);

            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // File file = searchFileName("D:\\PhamSon WorkSpace\\Java", "oop.txt");
        // System.out.println(file.getAbsolutePath());
        // System.out.println(readFileStream("D:\\PhamSon WorkSpace\\Java\\oop.txt"));
        // writeFileStream("abc\n", "D:\\PhamSon WorkSpace\\Java\\oop.txt");
        // appendContentToFile("abc d\n", "D:\\PhamSon WorkSpace\\Java\\oop.txt");
    }
}