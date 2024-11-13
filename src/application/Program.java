package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product>

        System.out.println("Entre com o caminho do arquivo: ");
        //colocar o caminho do arquivo ex: c:/temp/arquivo.csv
        String sourceFileStr = sc.nextLine();
        File sourceFile = new File(sourceFileStr);

        //pegar o caminho da pasta e armazenar em uma variavel
        String sourceFolderStr = sourceFile.getParent();

        //criar uma pasta apartir de um boolean
        //ira da erro se a pasta existir
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itemCsv = br.readLine();
            while(itemCsv != null) {
                String[] folder = itemCsv.split(";");
                String name = folder[0];
                double price = Double.parseDouble(folder[1]);
                int quantity = Integer.parseInt(folder[2]);
                list.add()
                System.out.println(itemCsv);
                itemCsv = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
