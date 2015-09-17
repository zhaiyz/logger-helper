package com.zhaiyz;

import org.testng.Assert;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import static org.testng.Assert.*;

/**
 * Created by zhaiyz on 15-9-17.
 */
public class LoggerHelperTest {

    @Test
    public void testIsTraceEnabled() throws Exception {
        assertTrue(LoggerHelper.isTraceEnabled(getClass()));
    }

    @Test
    public void testTrace() throws Exception {
        LoggerHelper.trace(getClass(), "This is a trace.");
    }

    @Test
    public void testTrace1() throws Exception {
        LoggerHelper.trace(getClass(), "This is a {}.", "trace");
    }

    @Test
    public void testTrace2() throws Exception {
        LoggerHelper.trace(getClass(), "This is {} {}.", "a", "trace");
    }

    @Test
    public void testTrace3() throws Exception {
        LoggerHelper.trace(getClass(), "This {} {} {}.", "is", "a", "trace");
    }

    @Test
    public void testTrace4() throws Exception {
        LoggerHelper.trace(getClass(), "This is a trace.", new Exception("This is a trace."));
    }

    @Test
    public void testIsDebugEnabled() throws Exception {
        assertTrue(LoggerHelper.isDebugEnabled(getClass()));
    }

    @Test
    public void testDebug() throws Exception {
        LoggerHelper.debug(getClass(), "This is a debug.");
    }

    @Test
    public void testDebug1() throws Exception {
        LoggerHelper.debug(getClass(), "This is a {}.", "debug");
    }

    @Test
    public void testDebug2() throws Exception {
        LoggerHelper.debug(getClass(), "This is {} {}.", "a", "debug");
    }

    @Test
    public void testDebug3() throws Exception {
        LoggerHelper.debug(getClass(), "This {} {} {}.", "is", "a", "debug");
    }

    @Test
    public void testDebug4() throws Exception {
        LoggerHelper.debug(getClass(), "This is a debug.", new Exception("This is a debug."));
    }

    @Test
    public void testIsInfoEnabled() throws Exception {
        assertTrue(LoggerHelper.isInfoEnabled(getClass()));
    }

    @Test
    public void testInfo() throws Exception {
        LoggerHelper.info(getClass(), "This is a info.");
    }

    @Test
    public void testInfo1() throws Exception {
        LoggerHelper.info(getClass(), "This is a {}.", "info");
    }

    @Test
    public void testInfo2() throws Exception {
        LoggerHelper.info(getClass(), "This is {} {}.", "a", "info");
    }

    @Test
    public void testInfo3() throws Exception {
        LoggerHelper.info(getClass(), "This {} {} {}.", "is", "a", "info");
    }

    @Test
    public void testInfo4() throws Exception {
        LoggerHelper.info(getClass(), "This is a info.", new Exception("This is a info."));
    }

    @Test
    public void testIsWarnEnabled() throws Exception {
        assertTrue(LoggerHelper.isWarnEnabled(getClass()));
    }

    @Test
    public void testWarn() throws Exception {
        LoggerHelper.warn(getClass(), "This is a warn.");
    }

    @Test
    public void testWarn1() throws Exception {
        LoggerHelper.warn(getClass(), "This is a {}.", "warn");
    }

    @Test
    public void testWarn2() throws Exception {
        LoggerHelper.warn(getClass(), "This is {} {}.", "a", "warn");
    }

    @Test
    public void testWarn3() throws Exception {
        LoggerHelper.warn(getClass(), "This {} {} {}.", "is", "a", "warn");
    }

    @Test
    public void testWarn4() throws Exception {
        LoggerHelper.warn(getClass(), "This is a warn.", new Exception("This is a warn."));
    }

    @Test
    public void testIsErrorEnabled() throws Exception {
        assertTrue(LoggerHelper.isErrorEnabled(getClass()));
    }

    @Test
    public void testError() throws Exception {
        LoggerHelper.error(getClass(), "This is a error.");
    }

    @Test
    public void testError1() throws Exception {
        LoggerHelper.error(getClass(), "This is a {}.", "error");
    }

    @Test
    public void testError2() throws Exception {
        LoggerHelper.error(getClass(), "This is {} {}.", "a", "error");
    }

    @Test
    public void testError3() throws Exception {
        LoggerHelper.error(getClass(), "This {} {} {}.", "is", "a", "error");
    }

    @Test
    public void testError4() throws Exception {
        LoggerHelper.error(getClass(), "This is a error.", new Exception("This is a error."));
    }
}
