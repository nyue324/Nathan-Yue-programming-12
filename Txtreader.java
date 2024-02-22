

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Txtreader {
public static void main(String[] args){
    File file = new File("happyorsad.txt");
    Scanner sc = null;
    try {
        sc = new Scanner(file);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    String x = sc.nextLine();
    String happy = ":-)";
    String sad = ":-(";
    int happyCount = 0;
    int sadCount = 0;
    String[] y = x.split(" ");
    for (String face : y){
        if (face.equals(happy)){happyCount++;
    }else if (face.equals(sad)) {
        sadCount++;
    }
    }
    if (happyCount > sadCount){
        System.out.println("happy");
    }else if (sadCount > happyCount){
        System.out.println("sad");
    } else if (happyCount == sadCount){
        System.out.println("unsure");
    }else if (happyCount == 0 && sadCount == 0){
        System.out.println("none");
    }
}
}