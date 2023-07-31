package ss16_IOBinaryFile_Serialization.baitap.CopyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Nhập vào đường dẫn file nguồn :");
        String sourcePath = in.nextLine();
        System.out.printf("Nhập vào đường dẫn file đích :");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            // copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Sao chép thành công !");
        } catch (IOException ioe) {
            System.out.printf("Không thể sao chép file !");
            System.out.printf(ioe.getMessage());
        }
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
