package academy.italo.maratonajava.javacore.Vio.test;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        //Criar pasta
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDiretorioCriado);

        //Criar arquivo
        File fileArquivoDiretoio = new File(fileDiretorio, "arquivo.txt");
        try {
            boolean isFileCreated = fileArquivoDiretoio.createNewFile();
            System.out.println("arquivo.txt criado? " + isFileCreated);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Renomear arquivo
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretoio.renameTo(fileRenamed);
        System.out.println("arquivo.txt foi renomeado? " + isRenamed);

        //Renomear pasta
        File diretorioRenamed = new File("folder2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio folder foi renomeado? " + isDiretorioRenomeado);
    }
}
