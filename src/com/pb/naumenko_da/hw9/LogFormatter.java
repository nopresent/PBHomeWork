package com.pb.naumenko_da.hw9;

import java.time.LocalDateTime;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return LocalDateTime.now() +";"+ record.getLevel() +";"+record.getMessage()+"\n";
    }
}
