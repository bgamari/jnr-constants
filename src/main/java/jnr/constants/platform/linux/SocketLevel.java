// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Feb 24 09:44:06 +1000 2009
package jnr.constants.platform.linux;
public enum SocketLevel implements jnr.constants.Constant {
SOL_SOCKET(1);
// SOL_IP not defined
// SOL_TCP not defined
// SOL_UDP not defined
private final int value;
private SocketLevel(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 1;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
