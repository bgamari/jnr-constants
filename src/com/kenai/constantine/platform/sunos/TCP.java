// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:35 +0000 2009
package com.kenai.constantine.platform.sunos;
public enum TCP implements com.kenai.constantine.Constant {
TCP_MSS(536),
// TCP_MAX_SACK not defined
// TCP_MINMSS not defined
// TCP_MINMSSOVERLOAD not defined
// TCP_MAXWIN not defined
// TCP_MAX_WINSHIFT not defined
// TCP_MAXBURST not defined
// TCP_MAXHLEN not defined
// TCP_MAXOLEN not defined
TCP_NODELAY(1),
TCP_MAXSEG(2),
// TCP_NOPUSH not defined
// TCP_NOOPT not defined
TCP_KEEPALIVE(8);
// TCP_NSTATES not defined
// TCP_RETRANSHZ not defined
private final int value;
private TCP(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 536;

public final int value() { return value; }
}
