// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Feb 24 09:44:03 +1000 2009
package com.kenai.constantine.platform.linux;
public enum RLIM implements com.kenai.constantine.Constant {
RLIM_NLIMITS(0xf),
RLIM_INFINITY(0xffffffff),
RLIM_SAVED_MAX(0xffffffff),
RLIM_SAVED_CUR(0xffffffff);
private final int value;
private RLIM(int value) { this.value = value; }
public static final long MIN_VALUE = 0xf;
public static final long MAX_VALUE = 0xffffffff;

public final int value() { return value; }
}
