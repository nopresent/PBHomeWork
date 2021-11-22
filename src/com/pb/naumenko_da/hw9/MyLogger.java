package com.pb.naumenko_da.hw9;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class MyLogger {

    static final Logger logger = Logger.getLogger(FileNumbers.class.getName());

    public static void logInit() {

        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            fileHandler.setFormatter(new LogFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
