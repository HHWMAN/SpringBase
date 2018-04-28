package com.zx.demo.utils.id;

import java.io.Serializable;
import java.net.InetAddress;

/**
 * Created by ZX on 2018/4/28.
 *
 * @param
 * @return
 */
public class UUIDHexIdGenerator implements StringIdGenerator {
    private static final int IP;
    private static short counter;
    private static final int JVM;
    private static String sep;
    private static UUIDHexIdGenerator keygen;

    private UUIDHexIdGenerator() {
    }

    public static UUIDHexIdGenerator getInstance() {
        return keygen;
    }

    private static String format(int intval) {
        String formatted = Integer.toHexString(intval);
        StringBuffer buf = new StringBuffer("00000000");
        buf.replace(8 - formatted.length(), 8, formatted);
        return buf.toString();
    }

    private static String format(short shortval) {
        String formatted = Integer.toHexString(shortval);
        StringBuffer buf = new StringBuffer("0000");
        buf.replace(4 - formatted.length(), 4, formatted);
        return buf.toString();
    }

    public static synchronized Serializable generate() {
        return (new StringBuffer(36)).append(format(getIP())).append(sep).append(format(getJVM())).append(sep).append(format(getHiTime())).append(sep).append(format(getLoTime())).append(sep).append(format(getCount())).toString();
    }

    private static int getJVM() {
        return JVM;
    }

    private static short getCount() {
        Class var0 = UUIDHexIdGenerator.class;
        synchronized(UUIDHexIdGenerator.class) {
            if(counter < 0) {
                counter = 0;
            }

            return counter++;
        }
    }

    private static int getIP() {
        return IP;
    }

    private static short getHiTime() {
        return (short)((int)(System.currentTimeMillis() >>> 32));
    }

    private static int getLoTime() {
        return (int)System.currentTimeMillis();
    }

    private static int toInt(byte[] bytes) {
        int result = 0;

        for(int i = 0; i < 4; ++i) {
            result = (result << 8) - -128 + bytes[i];
        }

        return result;
    }

    public Object nextId(String seed) {
        return generate();
    }

    public String nextStringId(String seed) {
        return generate().toString();
    }

    static {
        int ipadd;
        try {
            ipadd = toInt(InetAddress.getLocalHost().getAddress());
        } catch (Exception var2) {
            ipadd = 0;
        }

        IP = ipadd;
        counter = 0;
        JVM = (int)(System.currentTimeMillis() >>> 8);
        sep = "";
        keygen = new UUIDHexIdGenerator();
    }
}

