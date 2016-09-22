package net.mysticdrew.templatecraft.common.util;

import net.minecraftforge.fml.common.FMLLog;
import net.mysticdrew.templatecraft.common.reference.Constants;
import org.apache.logging.log4j.Level;

/**
 * Created by Mysticdrew on 9/19/2016.
 */
public class LogHelper {
    public static void log(Level level, Object o) {
        FMLLog.log(Reference.MOD_NAME, level, String.valueOf(o));
    }

    public static void all(Object o) {
        log(Level.ALL, o);
    }

    public static void debug(Object o) {
        log(Level.DEBUG, o);
    }

    public static void error(Object o) {
        log(Level.ERROR, o);
    }

    public static void fatal(Object o) {
        log(Level.FATAL, o);
    }

    public static void info(Object o) {
        log(Level.INFO, o);
    }

    public static void off(Object o) {
        log(Level.OFF, o);
    }

    public static void trace(Object o) {
        log(Level.TRACE, o);
    }

    public static void warn(Object o) {
        log(Level.WARN, o);
    }
}
