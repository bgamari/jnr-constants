// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2016-11-03 14:14:23 -0500
package jnr.constants.platform.solaris;
public enum PRIO implements jnr.constants.Constant {
PRIO_PROCESS(0L),
// PRIO_MIN not defined
PRIO_PGRP(1L),
PRIO_USER(2L);
// PRIO_MAX not defined
private final long value;
private PRIO(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 2L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}