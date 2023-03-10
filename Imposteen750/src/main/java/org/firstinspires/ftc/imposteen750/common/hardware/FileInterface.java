package org.firstinspires.ftc.imposteen750.common.hardware;

import android.os.Environment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInterface {

    public static final String IMU = "imu";
    public static final String INTAKE = "intake";
    public static final String LIFT = "lift";

    public static String read(String key) {
        File f = new File(Environment.getExternalStorageDirectory().getPath() + "/FIRST/data.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                if (nextLine.contains(key)) {
                    return nextLine.substring(key.length() + 1);
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "KEY/VALUE_NOT_FOUND_READ_" + key;
    }

    public static String write(String key, String value) {
        File f = new File(Environment.getExternalStorageDirectory().getPath() + "/FIRST/data.txt");
        try {
            f.createNewFile();
            PrintWriter pw = new PrintWriter(new FileWriter(f, true));
            pw.print(key + " " + value + "\n");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "KEY/VALUE_NOT_FOUND_WRITE_" + key;
    }

    public static void clear() {
        File f = new File(Environment.getExternalStorageDirectory().getPath() + "/FIRST/data.txt");
        f.delete();
    }
}

