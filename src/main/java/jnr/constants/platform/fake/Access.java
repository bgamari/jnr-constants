// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2015-05-05 15:32:20 -0400
package jnr.constants.platform.fake;
public enum Access implements jnr.constants.Constant {
F_OK(0x1),
X_OK(0x2),
W_OK(0x4),
R_OK(0x8);
private final long value;
private Access(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 0x8L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}