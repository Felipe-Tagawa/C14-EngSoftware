package org.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        String conteudo = FileUtils.readFileToString(new File("mensagem.txt"), StandardCharsets.UTF_8);
        System.out.println(conteudo);
        FileUtils.writeStringToFile(new File("mensagem.txt"), "Oi Zeca", StandardCharsets.UTF_8);
    }
}