// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:34 +0000 2009
package com.kenai.constantine.platform.sunos;
public enum RLIMIT implements com.kenai.constantine.Constant {
RLIMIT_AS(6),
RLIMIT_CORE(4),
RLIMIT_CPU(0),
RLIMIT_DATA(2),
RLIMIT_FSIZE(1),
// RLIMIT_LOCKS not defined
// RLIMIT_MEMLOCK not defined
// RLIMIT_MSGQUEUE not defined
// RLIMIT_NICE not defined
// RLIMIT_NLIMITS not defined
RLIMIT_NOFILE(5),
// RLIMIT_NPROC not defined
// RLIMIT_OFILE not defined
// RLIMIT_RSS not defined
// RLIMIT_RTPRIO not defined
// RLIMIT_RTTIME not defined
// RLIMIT_SIGPENDING not defined
RLIMIT_STACK(3);
private final int value;
private RLIMIT(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 6;

public final int value() { return value; }
}
