// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:33 +0000 2009
package jnr.constants.platform.sunos;
public enum PRIO implements jnr.constants.Constant {
PRIO_PROCESS(0),
// PRIO_MIN not defined
PRIO_PGRP(1),
PRIO_USER(2);
// PRIO_MAX not defined
private final int value;
private PRIO(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 2;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}
