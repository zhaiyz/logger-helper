package com.zhaiyz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public final class LoggerHelper {

    private LoggerHelper() {
    }

    private static final Map<String, Logger> LOGGER_MAP = new HashMap<String, Logger>();

    private static Logger getLogger(Class<?> clazz) {
        Logger logger = LOGGER_MAP.get(clazz.getName());
        if (logger == null) {
            logger = LoggerFactory.getLogger(clazz);
            LOGGER_MAP.put(clazz.getName(), logger);
        }
        return logger;
    }

    public static boolean isTraceEnabled(Class<?> clazz) {
        return getLogger(clazz).isTraceEnabled();
    }

    public static void trace(Class<?> clazz, String msg) {
        getLogger(clazz).trace(msg);
    }

    public static void trace(Class<?> clazz, String format, Object arg) {
        getLogger(clazz).trace(format, arg);
    }

    public static void trace(Class<?> clazz, String format, Object arg1, Object arg2) {
        getLogger(clazz).trace(format, arg1, arg2);
    }

    public static void trace(Class<?> clazz, String format, Object... arguments) {
        getLogger(clazz).trace(format, arguments);
    }

    public static void trace(Class<?> clazz, String msg, Throwable t) {
        getLogger(clazz).trace(msg, t);
    }

    public static boolean isDebugEnabled(Class<?> clazz) {
        return getLogger(clazz).isDebugEnabled();
    }

    public static void debug(Class<?> clazz, String msg) {
        getLogger(clazz).debug(msg);
    }

    public static void debug(Class<?> clazz, String format, Object arg) {
        getLogger(clazz).debug(format, arg);
    }

    public static void debug(Class<?> clazz, String format, Object arg1, Object arg2) {
        getLogger(clazz).debug(format, arg1, arg2);
    }

    public static void debug(Class<?> clazz, String format, Object... arguments) {
        getLogger(clazz).debug(format, arguments);
    }

    public static void debug(Class<?> clazz, String msg, Throwable t) {
        getLogger(clazz).debug(msg, t);
    }

    public static boolean isInfoEnabled(Class<?> clazz) {
        return getLogger(clazz).isInfoEnabled();
    }

    public static void info(Class<?> clazz, String msg) {
        getLogger(clazz).info(msg);
    }

    public static void info(Class<?> clazz, String format, Object arg) {
        getLogger(clazz).info(format, arg);
    }

    public static void info(Class<?> clazz, String format, Object arg1, Object arg2) {
        getLogger(clazz).info(format, arg1, arg2);
    }

    public static void info(Class<?> clazz, String format, Object... arguments) {
        getLogger(clazz).info(format, arguments);
    }

    public static void info(Class<?> clazz, String msg, Throwable t) {
        getLogger(clazz).info(msg, t);
    }

    public static boolean isWarnEnabled(Class<?> clazz) {
        return getLogger(clazz).isWarnEnabled();
    }

    public static void warn(Class<?> clazz, String msg) {
        getLogger(clazz).warn(msg);
    }

    public static void warn(Class<?> clazz, String format, Object arg) {
        getLogger(clazz).warn(format, arg);
    }

    public static void warn(Class<?> clazz, String format, Object... arguments) {
        getLogger(clazz).warn(format, arguments);
    }

    public static void warn(Class<?> clazz, String format, Object arg1, Object arg2) {
        getLogger(clazz).warn(format, arg1, arg2);
    }

    public static void warn(Class<?> clazz, String msg, Throwable t) {
        getLogger(clazz).warn(msg, t);
    }

    public static boolean isErrorEnabled(Class<?> clazz) {
        return getLogger(clazz).isErrorEnabled();
    }

    public static void error(Class<?> clazz, String msg) {
        getLogger(clazz).error(msg);
    }

    public static void error(Class<?> clazz, String format, Object arg) {
        getLogger(clazz).error(format, arg);
    }

    public static void error(Class<?> clazz, String format, Object arg1, Object arg2) {
        getLogger(clazz).error(format, arg1, arg2);
    }

    public static void error(Class<?> clazz, String format, Object... arguments) {
        getLogger(clazz).error(format, arguments);
    }

    public static void error(Class<?> clazz, String msg, Throwable t) {
        getLogger(clazz).error(msg, t);
    }

}
