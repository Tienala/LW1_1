/*
 * Main
 *
 * Version 1
 *
 * Nataliia Zviertseva, KhPI
 * Task 1
 */
package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
      String text = new String(Files.readAllBytes(Paths.get("D:\\Harry.txt")));
        String cleanedText = text
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "")
                .replaceAll(";", "")
                .replaceAll("!", "")
                .replaceAll("\n|\r\n", "")
                .toLowerCase();
        String[] words = cleanedText.split(" ");
        int longestWord = 0;
        String longWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord) {
                longestWord = words[i].length();
                longWord = words[i];
            }
        }
        System.out.println("The longest word is - " + longWord);
    }
}








